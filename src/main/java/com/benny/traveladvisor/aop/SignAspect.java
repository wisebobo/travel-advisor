package com.benny.traveladvisor.aop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.benny.traveladvisor.common.utils.JsonUtil;
import com.benny.traveladvisor.common.utils.RSASignUtil;
import com.benny.traveladvisor.common.utils.RSAUtil;
import com.benny.traveladvisor.dao.PartnerDao;
import com.benny.traveladvisor.dto.ErrorResponse;
import com.benny.traveladvisor.pojo.Partner;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a aspect class to generate the signature of a response
 *
 * @author benny.li
 * @data 2020/5/14
 */
@Aspect
@Component
@Slf4j
public class SignAspect {
    @Value("${advisor.config.system.partner}")
    private String sysAppId;

    @Autowired
    private PartnerDao partnerDao;

    /**
     * Description: Defining the point cut
     * @author benny.li
     * Date: 2020/5/18
     */
    @Pointcut("execution(* com.benny.traveladvisor.controller..*.*(..))")
//    @Pointcut("@annotation(com.benny.traveladvisor.annotation.CheckSign)")
    public void pointCut() {

    }

    /**
     * Description: This is the Aspect function to generate the response signature
     * @author benny.li
     * Date: 2020/5/18
     * @param pjp: ProceedingJoinPoint
     * @return java.lang.Object
     */
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

            assert attributes != null;
            HttpServletRequest req = attributes.getRequest();
            HttpServletResponse response = attributes.getResponse();

            String uri = req.getRequestURI();

            Object obj = pjp.proceed();

            long now = System.currentTimeMillis() / 1000;
            String content = JsonUtil.objectToString(obj);
            String contentToSign = sysAppId + now + uri + content;
            Partner partner = partnerDao.getPartnerByCode(sysAppId);
            String sign = "";
            if (partner != null) {
                sign = RSASignUtil.sign(contentToSign, partner.getRsaPrivateKey());
            }

            assert response != null;
            response.setHeader("X-API-APPID", sysAppId);
            response.setHeader("X-API-TIMESTAMP", String.valueOf(now));
            response.setHeader("X-API-SIGN", sign);

            return obj;

        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }

}
