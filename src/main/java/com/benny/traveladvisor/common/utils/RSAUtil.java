package com.benny.traveladvisor.common.utils;

import lombok.extern.slf4j.Slf4j;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * Description: This is the RSA encryption utility
 * @author benny.li
 * Date: 2020/5/18
 */
@Slf4j
public class RSAUtil {
    public static final String PUBLIC_KEY = "publicKey";
    public static final String PRIVATE_KEY = "privateKey";
    public static final String KEY_ALGORITHM = "RSA";
    public static final int KEY_SIZE = 2048;

    /**
     * Description: 随机生成密钥对
     * @author benny.li
     * Date: 2020/5/18
     * @return java.util.Map<java.lang.String,java.lang.String>
     */
    public static Map<String, String> genKeyPair() throws NoSuchAlgorithmException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
            keyPairGenerator.initialize(KEY_SIZE);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
            RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
            Map<String, String> keyMap = new HashMap<>();
            keyMap.put(PUBLIC_KEY, Base64.getEncoder().encodeToString(publicKey.getEncoded()));
            keyMap.put(PRIVATE_KEY, Base64.getEncoder().encodeToString(privateKey.getEncoded()));
            return keyMap;
        } catch (NoSuchAlgorithmException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * Description: RSA公钥加密
     * @author benny.li
     * Date: 2020/5/18
     * @param str: 待加密字符串
     * @param publicKey: 公钥
     * @return java.lang.String 密文
     */
    public static String encrypt(String str, String publicKey) throws Exception{
        //base64编码的公钥
        byte[] decoded = Base64.getDecoder().decode(publicKey);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
        //RSA加密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        String outStr = Base64.getEncoder().encodeToString(cipher.doFinal(str.getBytes("UTF-8")));
        return outStr;
    }

    /**
     * Description: RSA私钥解密
     * @author benny.li
     * Date: 2020/5/18
     * @param str: 加密字符串
     * @param privateKey: 私钥
     * @return java.lang.String 明文
     */
    public static String decrypt(String str, String privateKey) throws Exception{
        //64位解码加密后的字符串
        byte[] inputByte = Base64.getDecoder().decode(str.getBytes("UTF-8"));
        //base64编码的私钥
        byte[] decoded = Base64.getDecoder().decode(privateKey);
        RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
        //RSA解密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, priKey);
        String outStr = new String(cipher.doFinal(inputByte));
        return outStr;
    }

    public static void main(String[] args) throws Exception {
        //生成公钥和私钥
        Map<String, String> keyMap = genKeyPair();
        //加密字符串
        String message = "123456";
        System.out.println("随机生成的公钥为:" + keyMap.get(PUBLIC_KEY));
        System.out.println("随机生成的私钥为:" + keyMap.get(PRIVATE_KEY));
        String messageEn = encrypt(message,keyMap.get(PUBLIC_KEY));
        System.out.println("待加密的字符串为:" + message);
        System.out.println("加密后的字符串为:" + messageEn);
        String messageDe = decrypt(messageEn,keyMap.get(PRIVATE_KEY));
        System.out.println("还原后的字符串为:" + messageDe);
    }
}
