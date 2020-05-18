package com.benny.traveladvisor.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Description: This is a Base64 utility class
 * @author benny.li
 * Date: 2020/5/18
 */
@Slf4j
public class Base64Util {

    /**
     * Description: Get a base64 encoded string with default UTF-8 encoding
     * @author benny.li
     * Date: 2020/5/18
     * @param str: String to be encoded
     * @return java.lang.String
     */
    public static String encode(String str) throws UnsupportedEncodingException {
        return encode(str, "utf-8");
    }

    /**
     * Description: Get a base64 encoded string with given encoding
     * @author benny.li
     * Date: 2020/5/18
     * @param str: String to be encoded
     * @param encoding:
     * @return java.lang.String
     */
    public static String encode(String str, String encoding) throws UnsupportedEncodingException {
        return Base64.getEncoder().encodeToString(str.getBytes(encoding));
    }

    /**
     * Description: Decode a base64 string with default UTF-8 encoding
     * @author benny.li
     * Date: 2020/5/18
     * @param str: String to be decoded
     * @return java.lang.String
     */
    public static String decode(String str) throws UnsupportedEncodingException {
        byte[] base64decodedBytes = Base64.getDecoder().decode(str);
        return new String(base64decodedBytes, "utf-8");
    }

    public static void main(String[] args) throws Exception {
        String str = "Hello World";

        String encodedStr = encode(str);
        String decodedStr = decode(encodedStr);

        System.out.println(encodedStr);
        System.out.println(decodedStr);
    }
}
