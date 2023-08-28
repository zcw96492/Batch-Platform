package com.newcore.batch.platform.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5工具类
 * @author zhouchaowei
 * @date 2023-08-28
 */
public class Md5Utils {

    private static Md5Utils md5UtilsInstance;
    private Md5Utils (){}

    public static synchronized Md5Utils getInstance() {
        if (md5UtilsInstance == null) {
            md5UtilsInstance = new Md5Utils();
        }
        return md5UtilsInstance;
    }

    /**
     * MD5字符串加密方法
     * @param str 要加密的字符串
     * @return 加密后的字符串
     */
    public String digest(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        /* 计算md5函数 */
        messageDigest.update(str.getBytes());
        return new BigInteger(1, messageDigest.digest()).toString(16);

    }
}
