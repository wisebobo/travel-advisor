package com.benny.traveladvisor.common.utils;

import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Description: RSA签名、验证、解签
 * @author benny.li
 * Date: 2020/5/18
 */
@Slf4j
public class RSASignUtil {
    /**
     * 签名算法
     * RSA支持:MD2withRSA、MD5withRSA、SHA1withRSA、SHA256withRSA、SHA384withRSA、SHA512withRSA
     */
    public static final String SIGN_ALGORITHMS = "SHA256withRSA";
    private static final String UTF_8 = "UTF-8";

    /**
     * 识别字符串状态机转换：<br>
     * STATUS_KEY --[=]--> STATUS_SIMPLEVALUE STATUS_SIMPLEVALUE --[&]-->
     * STATUS_KEY STATUS_SIMPLEVALUE --[{]--> STATUS_COMPLEXVALUE
     * STATUS_COMPLEXVALUE --[}]--> STATUS_SIMPLEVALUE STATUS_COMPLEXVALUE
     * --[=]--> STATUS_COMPLEXVALUE STATUS_COMPLEXVALUE --[&]-->
     * STATUS_COMPLEXVALUE
     */
    private static int STATUS_KEY = 1;
    private static int STATUS_SIMPLEVALUE = 2;
    private static int STATUS_COMPLEXVALUE = 4;

    /**
     * 将key1=value1&key2=value2形式的字符串转转换为一个排序的map<br>
     * 此方法忽略字符串前后可能存在的"{}"字符<br
     * 样例字符串：{accessType=0&bizType=000201&currencyCode=156&encoding=UTF-8&
     * issuerIdentifyMode=0&merId=777290058110048&orderId=20160317150838&
     * origRespCode=00&origRespMsg=成功[0000000]&payCardType=01&queryId=
     * 201603171508382661928&reqReserved={a=aaa&b=bbb&c=ccc}&respCode=00&respMsg
     * =成功[0000000]&settleAmt=10000&settleCurrencyCode=156&settleDate=0317&
     * signMethod=01&traceNo=266192&traceTime=0317150838&txnAmt=10000&txnSubType
     * =01&txnTime=20160317150838&txnType=01&version=5.0.0&certId=68759585097&
     * signature=EpwPj3OIQgCmr9FfdJIs/dYG+
     * CVnYOm9JwoC4dyaEjtgdSCzRNyWGOCbToHs5sAbVfjqSUi/o3ctqAaOJEyMEIdbZt+
     * hVQcWDmUovQs6ruQM5VN0tNdRsR+QANo1f1LYNs6q89UhGo+OIpFMMB+jdb2Sg54XFH++
     * ywqXoL0WCWWwtzeu2Haqq8LM5P1j4p0FqrAYuEI58zy40g/T4S+
     * eTBrZZx8MGGNcAQDMsk2IEsuEa1IVzzAIW5ZvsG2Ypf74DJpPEGMgzInKUyC1+BblJ/
     * oYGIRQyeYan0jd/7nZuvTB5nmoTdSgSsPZlnuSsPvHP+BK48MyrvsWRJXH983VFw==}
     *
     * @param keyValueString
     * @return
     */
    public static SortedMap<String, String> keyValueStringToMap(String keyValueString) {
        if (Strings.isNullOrEmpty(keyValueString)) {
            return null;
        }

        StringBuilder sb = new StringBuilder(keyValueString);
        if (sb.charAt(0) == '{') {
            sb.deleteCharAt(0);
        }
        if (sb.charAt(sb.length() - 1) == '}') {
            sb.deleteCharAt(sb.length() - 1);
        }

        SortedMap<String, String> map = new TreeMap<String, String>();

        int currentIndex = 0;
        String key = null;
        String value = null;

        int status = STATUS_KEY;

        for (int i = 0; i < sb.length(); ++i) {
            char c = sb.charAt(i);
            // 状态转换
            if (status == STATUS_KEY && c == '=') {
                status = STATUS_SIMPLEVALUE;
                key = sb.substring(currentIndex, i);
                currentIndex = i + 1;
            } else if (status == STATUS_SIMPLEVALUE && c == '&') {
                status = STATUS_KEY;
                value = sb.substring(currentIndex, i);
                map.put(key, value);
                currentIndex = i + 1;
            } else if (status == STATUS_SIMPLEVALUE && c == '{') {
                status = STATUS_COMPLEXVALUE;
            } else if (status == STATUS_COMPLEXVALUE && c == '}') {
                status = STATUS_SIMPLEVALUE;
            }
        }
        value = sb.substring(currentIndex, sb.length());
        map.put(key, value);

        return map;
    }

    /**
     * Description: 将Map中的数据转换成按照Key的ascii码排序后的key1=value1&key2=value2的形式
     * @author benny.li
     * Date: 2020/5/18
     * @param map:
     * @return java.lang.String
     */
    public static String mapToString(Map<String, String> map) {
        SortedMap<String, String> sortedMap = new TreeMap<String, String>(map);

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            if (Strings.isNullOrEmpty(entry.getValue().trim())) {
                continue;
            }
            sb.append(entry.getKey()).append('=').append(entry.getValue()).append('&');
        }

        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.length() == 0 ? "" : sb.toString();
    }

    /**
     * Description: 从密钥字符串（经过base64编码）中提取私钥
     * @author benny.li
     * Date: 2020/5/18
     * @param keyStr: 密钥字符串（经过base64编码）
     * @return java.security.PrivateKey
     */
    public static PrivateKey getPrivateKey(String keyStr) throws Exception {
        // 获取私钥密钥字节数组
        byte[] keyBytes = Base64.getDecoder().decode(keyStr);
        // 由私钥密钥字节数组获得密钥规范
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
        // 实例化密钥工厂，并指定RSA算法
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        // 生成私钥
        PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
        return privateKey;
    }

    /**
     * Description: 从密钥字符串（经过base64编码）中提取公钥
     * @author benny.li
     * Date: 2020/5/18
     * @param keyStr: 密钥字符串（经过base64编码）
     * @return java.security.PublicKey
     */
    public static PublicKey getPublicKey(String keyStr) throws Exception {
        // 获取公钥密钥字节数组
        byte[] keyBytes = Base64.getDecoder().decode(keyStr);
        // 获得密钥规范
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        // 实例化密钥工厂，并指定RSA算法
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        // 生成公钥
        PublicKey pubKey = keyFactory.generatePublic(keySpec);

        return pubKey;
    }

    /**
     * Description: RSA签名，字符集为UTF-8
     * @author benny.li
     * Date: 2020/5/18
     * @param content: 待签名字符串
     * @param privateKey: 私钥
     * @return java.lang.String
     */
    public static String sign(String content, String privateKey) {
        return sign(content, privateKey, UTF_8);
    }

    /**
     * Description: 将map中元素的key值按升序排序为"key1=value1&key2=value2"的方式进行RSA签名
     * @author benny.li
     * Date: 2020/5/18
     * @param map: 待签名map
     * @param privateKey: rsa私钥
     * @param charsetName: 字符集
     * @return java.lang.String
     */
    public static String sign(Map<String, String> map, String privateKey, String charsetName) {
        String sign = "";
        String signTempStr = mapToString(map);
        sign = sign(signTempStr, privateKey, charsetName);
        return sign;
    }

    /**
     * Description: 将map中元素的key值按升序排序为"key1=value1&key2=value2"的方式进行RSA签名，字符集为UTF-8
     * @author benny.li
     * Date: 2020/5/18
     * @param map: 待签名map
     * @param privateKey: rsa私钥
     * @return java.lang.String
     */
    public static String sign(Map<String, String> map, String privateKey) {
        return sign(map, privateKey, UTF_8);
    }

    /**
     * Description: RSA签名
     * @author benny.li
     * Date: 2020/5/18
     * @param content: 待签名数据
     * @param privateKey: 商户私钥
     * @param input_charset: 编码格式
     * @return java.lang.String
     */
    public static String sign(String content, String privateKey, String input_charset) {
        try {
            // 生成私钥
            PrivateKey priKey = getPrivateKey(privateKey);
            // 实例化Signature对象
            Signature signature = Signature.getInstance(SIGN_ALGORITHMS);
            // 初始化用于签名操作的Signature对象
            signature.initSign(priKey);
            // 使用指定的 byte 数组更新要签名的数据
            signature.update(content.getBytes(input_charset));
            // 签名
            byte[] signed = signature.sign();
            return Base64.getEncoder().encodeToString(signed);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * Description: 将map中元素的key值按升序排序为"key1=value1&key2=value2"的方式进行RSA验签
     * @author benny.li
     * Date: 2020/5/18
     * @param str: 待验签字符串
     * @param sign: 验签签名
     * @param publicKey: rsa公钥
     * @return boolean true:验签成功，false:验签失败
     */
    public static boolean verify(String str, String sign, String publicKey) {
        return verify(str, sign, publicKey, UTF_8);
    }

    /**
     * Description: RSA验签，字符集为UTF-8
     * @author benny.li
     * Date: 2020/5/18
     * @param map: 待验签map
     * @param sign: 验签签名
     * @param publicKey: rsa公钥
     * @param charsetName: 字符集
     * @return boolean true:验签成功，false:验签失败
     */
    public static boolean verify(Map<String, String> map, String sign, String publicKey, String charsetName) {
        String verfiyTempStr = mapToString(map);
        return verify(verfiyTempStr, sign, publicKey, charsetName);
    }

    /**
     * Description: RSA验签，字符集为UTF-8
     * @author benny.li
     * Date: 2020/5/18
     * @param map: 待验签map
     * @param sign: 验签签名
     * @param publicKey: 系统分配的rsa公钥
     * @return boolean true:验签成功，false:验签失败
     */
    public static boolean verify(Map<String, String> map, String sign, String publicKey) {
        return verify(map, sign, publicKey, UTF_8);
    }

    /**
     * Description: RSA验签名校验
     * @author benny.li
     * Date: 2020/5/18
     * @param content: 待签名数据
     * @param sign: 签名值
     * @param public_key: 公钥
     * @param input_charset: 编码格式
     * @return boolean
     */
    public static boolean verify(String content, String sign, String public_key, String input_charset) {
        try {
            // 生成公钥
            PublicKey pubKey = getPublicKey(public_key);
            // 实例化Signature对象
            Signature signature = Signature.getInstance(SIGN_ALGORITHMS);
            // 初始化用于验签操作的Signature对象
            signature.initVerify(pubKey);
            // 使用指定的 byte 数组更新要验签的数据
            signature.update(content.getBytes(input_charset));
            // 验签
            return signature.verify(Base64.getDecoder().decode(sign));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return false;
    }


    public static void main(String[] args) throws Exception {
        //生成公钥和私钥
        Map<String, String> keyMap = RSAUtil.genKeyPair();

        String publicKey = keyMap.get("publicKey");
        String privateKey = keyMap.get("privateKey");

        String message = "{a=123456&b=abcd}";
        System.out.println("随机生成的公钥为:" + publicKey);
        System.out.println("随机生成的私钥为:" + privateKey);
        String messageSign = sign(message, privateKey, "UTF-8");
        System.out.println("待加密的字符串为:" + message);
        System.out.println("签名后的字符串为:" + messageSign);
        Boolean verifyResult = verify(message, messageSign, publicKey, "UTF-8");
        if (verifyResult) {
            System.out.println("Match");
        } else {
            System.out.println("UnMatch");
        }
    }
}
