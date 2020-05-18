package com.benny.traveladvisor.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

/**
 * Description: This is a Jackson utility to convert between String and Object
 * @author benny.li
 * Date: 2020/5/18
 */
@Slf4j
public class JsonUtil {

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(format);
    }

    public static String objectToString(Object o) {
        if (o!=null) {
            try {
                return mapper.writeValueAsString(o);
            } catch (JsonProcessingException e) {
                log.error("transform from object to json string occurs error: ", e);
            }
        }
        return "";
    }

    public static <T> T stringToObject(String jsonStr, Class<T> clazz) {
        if (!Strings.isNullOrEmpty(jsonStr)) {
            try {
                mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                return mapper.readValue(jsonStr, clazz);
            } catch (IOException e) {
                log.error("transform to object occurs error: ", e);
            }
        }
        return null;
    }

    public static <T> T stringToObject(String json, TypeReference<T> jsonTypeReference) {
        try {
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return (T) mapper.readValue(json, jsonTypeReference);
        } catch (IOException e) {
            log.error("transform to object occurs error: ", e);
        }
        return null;
    }

    public static void writeJsonResponse(Object object, HttpServletResponse response, int statusCode) {
        String jsonStr = objectToString(object);
        response.setContentType("application/json; charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        response.setStatus(statusCode);
        PrintWriter out = null;
        try {
            out = response.getWriter();
            log.info("the return parameters is {} ", jsonStr);
            out.write(jsonStr);
            out.flush();
        } catch (IOException e) {
            log.error("write json to client occurs error: ", e);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
