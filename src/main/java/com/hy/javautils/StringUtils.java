package com.hy.javautils;

public class StringUtils {

    /**
     * 判断字符串为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        return str == null || str.length()==0 ? true:false;
    }

    /**
     * 判断字符串不为空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
