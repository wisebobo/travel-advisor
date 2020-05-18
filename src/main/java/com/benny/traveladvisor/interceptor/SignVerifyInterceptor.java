package com.benny.traveladvisor.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.benny.traveladvisor.annotation.CheckSign;
import com.benny.traveladvisor.common.utils.Const;
import com.benny.traveladvisor.common.utils.JsonUtil;
import com.benny.traveladvisor.common.utils.RSASignUtil;
import com.benny.traveladvisor.dao.PartnerDao;
import com.benny.traveladvisor.dto.ErrorResponse;
import com.benny.traveladvisor.pojo.Partner;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Description: An interceptor class for verifying the request (including appid, timestamp and signature)
 * @author benny.li
 * Date: 2020/5/18
 */
@Component
@Slf4j
public class SignVerifyInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private PartnerDao partnerDao;

    private static ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

    @Value("${advisor.config.timeGapInSecond}")
    private String timeGapInSecond;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (null == handler || !(handler instanceof HandlerMethod)) {
            return super.preHandle(request, response, handler);
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        CheckSign signAnnotation = handlerMethod.getMethodAnnotation(CheckSign.class);
        if (signAnnotation == null) return true;

        String appId= "";
        String sign = "";
        String contentToSign = "";
        long timestamp = 0;
        boolean isValidSign = false;
        boolean isValidTimestamp = false;
        boolean isValidMethod = true;
        boolean isValidParam = false;
        boolean isValidPartner = false;

        String uri = request.getRequestURI();
        String method = request.getMethod();

//        Map<String, String> pathVariables = (Map<String, String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
//        System.out.println("fromCountry = " + (String) pathVariables.get("fromCountry"));
//        for (String str : pathVariables.keySet()) {
//            System.out.println(str + " = " + pathVariables.get(str));
//        }

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);

            switch (key.toUpperCase()) {
                case "X-API-TIMESTAMP":
                    timestamp = Long.parseLong(value);
                    break;
                case "X-API-APPID":
                    appId = value;
                    break;
                case "X-API-SIGN":
                    sign = value;
                    break;
//                default:
//                    log.info("HTTP Request Header: {} = {}", key, value);
//                    break;
            }
        }

        // 定制化Logger内容，对应 logback-spring.xml里面的配置
        MDC.put(Const.LOGGER_REQUEST_URI, uri);
        MDC.put(Const.LOGGER_REQUEST_ID, appId);
        MDC.put(Const.LOGGER_MAIN_THREAD, String.valueOf(new Date().getTime() + threadLocalRandom.nextInt(1000)));

        // 检查是否必须的Header都提供了
        if (timestamp > 0 && Strings.isNotBlank(appId) && Strings.isNotBlank(sign)) {
            isValidParam = true;
        }

        // 根据不同的请求方法，拼接待验证签名的字符串
        if (method.equals("POST") || method.equals("PUT")) {
            String bodyInfo = IOUtils.toString(request.getInputStream(), "utf-8");
            JSONObject jsonBody = JSON.parseObject(bodyInfo, Feature.OrderedField);
            contentToSign = appId + timestamp + uri + jsonBody.toString();
        } else if (method.equals("GET") || method.equals("DELETE")) {
            Map<String, String> paramMap = new HashMap<>();
            Map<String, String[]> map = request.getParameterMap();

            for (Map.Entry<String, String[]> entry : map.entrySet()) {
                if ("sign".equals(entry.getKey())) {
                    sign = entry.getValue()[0];
                    continue;
                }

                for(int i = 0; i < entry.getValue().length; i++){
                    log.info("Request Param {} = {}", entry.getKey(), entry.getValue()[i]);
                    paramMap.put(entry.getKey(), entry.getValue()[i]);
                }
            }

            String paramString = RSASignUtil.mapToString(paramMap);
            contentToSign = appId + timestamp + uri + paramString;

        } else {
            log.info(method);
            isValidMethod = false;
        }

        // 请求时间戳必须在服务器当前时间允许的 +/- 时差范围内
        long now = System.currentTimeMillis() / 1000;
        long prev_timestamp = now - Long.parseLong(timeGapInSecond);
        long future_timestamp = now + Long.parseLong(timeGapInSecond);
        if (!(future_timestamp > timestamp && timestamp > prev_timestamp)) {
            log.warn("Input timestamp = {}, Prev Timestamp = {}, Future Timestamp = {}", timestamp, prev_timestamp, future_timestamp);
        } else {
            isValidTimestamp = true;
        }

        if (isValidMethod) {
            Partner partner = partnerDao.getPartnerByCode(appId);

            if (partner != null) {
                isValidPartner = true;
                isValidSign = RSASignUtil.verify(contentToSign, sign, partner.getRsaPublicKey());
            }
        }

        if (isValidMethod && isValidSign && isValidTimestamp && isValidParam) {
            log.info("Successfully pass validation");
            return true;
        } else {
            if (!isValidMethod) {
                JsonUtil.writeJsonResponse(ErrorResponse.METHOD_NOT_ALLOW, response, ErrorResponse.METHOD_NOT_ALLOW.getStatus());
            } else if (!isValidParam) {
                JsonUtil.writeJsonResponse(ErrorResponse.INVALID_PARAMETER, response, ErrorResponse.INVALID_PARAMETER.getStatus());
            } else if (!isValidPartner) {
                JsonUtil.writeJsonResponse(ErrorResponse.PARTNER_NOT_FOUND, response, ErrorResponse.PARTNER_NOT_FOUND.getStatus());
            } else if (!isValidTimestamp) {
                JsonUtil.writeJsonResponse(ErrorResponse.INVALID_TIMESTAMP, response, ErrorResponse.INVALID_TIMESTAMP.getStatus());
            } else {
                JsonUtil.writeJsonResponse(ErrorResponse.INVALID_SIGNATURE, response, ErrorResponse.INVALID_SIGNATURE.getStatus());
            }
            log.info("Failed to pass the validation");
            return false;
        }

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        if (null != handler && handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            CheckSign signAnnotation = handlerMethod.getMethodAnnotation(CheckSign.class);
            if (signAnnotation != null) {
                MDC.remove(Const.LOGGER_REQUEST_ID);
                MDC.remove(Const.LOGGER_REQUEST_URI);
                MDC.remove(Const.LOGGER_MAIN_THREAD);
            }
        }
    }

}
