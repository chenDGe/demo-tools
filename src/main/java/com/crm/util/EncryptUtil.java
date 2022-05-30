package com.crm.util;

import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 *  加密工具类
 *  SHA-1加密结果40位
 *  MD5加密结果32位
 */
@Service
public final class EncryptUtil {
    private static final String PASSWORD_KRY = "11112222";
    private final static String DES = "DES";

    /**
     *  MD5+SHA-1二次加密
     * @param str
     * @return
     * @throws IllegalAccessException
     */
    public final static String md5AndSha(String str) throws IllegalAccessException {
        return md5(sha(str)).toUpperCase();
    }

    /**
     *  SHA-1+MD5二次加密
     * @param str
     * @return
     * @throws IllegalAccessException
     */
    public final static String shaAndMd5(String str) throws IllegalAccessException {
        return sha(md5(str)).toUpperCase();
    }
    /**
     *  MD5加密
     * @param str
     * @return
     * @throws IllegalAccessException
     */
    public final static String md5(String str) throws IllegalAccessException {
        return encrypt(str,"md5");
    }

    /**
     *  SHA-1加密
     * @param str
     * @return
     * @throws IllegalAccessException
     */
    public final static String sha(String str) throws IllegalAccessException {
        return encrypt(str, "sha-1");
    }

    /**
     *  加密
     * @param src  加密串
     * @param algorithmName  加密算法
     * @return
     */
    private final static String encrypt(String src,String algorithmName) throws IllegalAccessException {
        if(src==null || "".equals(src.trim())){
            throw new IllegalAccessException("未检测到需要加密的字符串！！");
        }
        if(algorithmName==null || "".equals(algorithmName.trim())){
            algorithmName="md5";
        }
        String encryptText=null;
        try {
            MessageDigest messageDigest=MessageDigest.getInstance(algorithmName);
            messageDigest.update(src.getBytes(StandardCharsets.UTF_8));
            byte byt[]=messageDigest.digest();
            encryptText=hex(byt);
        }catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return  encryptText;
    }

    /**
     * 密码解密
     * @param password
     * @return
     */
    private final static String decrypt(String password){
        try {
            return new String(decrypt(hex2byte(password.getBytes()),PASSWORD_KRY.getBytes()));
        }catch (Exception e){
        }
        return null;
    }
    /**
     *  密码加密
     * @param password
     * @return
     */
    private final static String encrypt(String password){
        try{
            return byte2hex(encrypt(password.getBytes(),PASSWORD_KRY.getBytes()));
        }catch (Exception e){
        }
        return null;
    }
    /**
     *  加密
     * @param src   数据源
     * @param key   8位密钥
     * @return      解密后的原始数据
     * @throws Exception
     */
    private final static byte[] encrypt(byte[] src,byte[] key) throws Exception {
        // 为DES算法创建一个可信任的随机数源
        SecureRandom secureRandom=new SecureRandom();
        // 创建一个DESKeySpec对象
        DESKeySpec desKeySpec=new DESKeySpec(key);
        // 通过工厂类获取一个Secretkey对象
        SecretKeyFactory keyFactory=SecretKeyFactory.getInstance(DES);
        SecretKey secretKey=keyFactory.generateSecret(desKeySpec);
        // Cipher对象进行解密操作
        Cipher cipher=Cipher.getInstance(DES);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.ENCRYPT_MODE,secretKey,secureRandom);
        // 解密
        byte[] arr=cipher.doFinal(src);
        return arr;

    }
    /**
     *  解密
     * @param src   数据源
     * @param key   8位密钥
     * @return      解密后的原始数据
     * @throws Exception
     */
    private final static byte[] decrypt(byte[] src,byte[] key) throws Exception {
        // 为DES算法创建一个可信任的随机数源
        SecureRandom secureRandom=new SecureRandom();
        // 创建一个DESKeySpec对象
        DESKeySpec desKeySpec=new DESKeySpec(key);
        // 通过工厂类获取一个Secretkey对象
        SecretKeyFactory keyFactory=SecretKeyFactory.getInstance(DES);
        SecretKey secretKey=keyFactory.generateSecret(desKeySpec);
        // Cipher对象进行解密操作
        Cipher cipher=Cipher.getInstance(DES);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE,secretKey,secureRandom);
        // 解密
        byte[] arr=cipher.doFinal(src);
        return arr;

    }
    /**
     *
     * @param arr
     * @return
     * @throws IllegalAccessException
     */
    private final static byte[] hex2byte(byte[] arr) throws IllegalAccessException {
        if((arr.length % 2) !=0)
            throw new IllegalAccessException("长度不是偶数！");
        byte[] b=new byte[arr.length / 2 ];
        for(int i=0; i < arr.length; i =+ 2){
            String item=new String(arr ,i ,2);
            b[i/2]=(byte) Integer.parseInt(item);
        }
        return b;
    }
    /**
     * 二进制转字符串
     * @param arr
     * @return
     */
    private final static String byte2hex(byte[] arr){
        String hs="";
        String stmp="";
        for (int i=0;i<arr.length;i++){
            stmp=(Integer.toHexString(arr[i] & 0xFF));
            if(stmp.length() == 1){
                hs=hs + "0" +stmp;
            }else{
                hs= hs +stmp;
            }
        }
        return hs.toUpperCase();
    }
    /**
     * 返回16进制字符串
     * @param arr
     * @return
     */
    private final static String hex(byte[] arr){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(Integer.toHexString((arr[i] & 0xFF) | 0x100).substring(1,3));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try{
            System.out.println(sha("admin123"));
            System.out.println(md5("admin123"));
            System.out.println(shaAndMd5("admin123"));
            System.out.println(md5AndSha("admin123"));
            System.out.println(encrypt("admin123"));
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

