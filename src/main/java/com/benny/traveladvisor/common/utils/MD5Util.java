package com.benny.traveladvisor.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.DigestUtils;

/**
 * Description: This is a MD5 utility class
 * @author benny.li
 * Date: 2020/5/18
 */
@Slf4j
public class MD5Util {

    /**
     * Description: Generate MD5 string without salt
     * @author benny.li
     * Date: 2020/5/18
     * @param str: String to be encrypted
     * @return java.lang.String
     */
    public static String getMD5(String str) {
        return DigestUtils.md5DigestAsHex(str.getBytes());
    }

    /**
     * Description: Generate MD5 string with salt
     * @author benny.li
     * Date: 2020/5/18
     * @param str: String to be encrypted
     * @param salt:
     * @return java.lang.String
     */
    public static String getMD5(String str, String salt) {
        String base = str + salt;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }

    public static void main(String[] args) throws Exception {
        String str = "Hello World";
        String salt = "abc123";

        String encodedStr1 = getMD5(str);
        String encodedStr2 = getMD5(str, salt);

        System.out.println(encodedStr1);
        System.out.println(encodedStr2);
    }
}
