package com.hy.javautils;

import com.hy.exception.ErrorCode;
import com.hy.exception.HyException;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * Created by huyue on 2017/7/12.
 */
public class CommonUtils {

    /**
     * 对象属性参数检测，属性值不能为空或空字符串
     * @param t
     * @param excludeProperty 不用检测的属性
     * @param <T>
     * @throws IllegalAccessException
     */
    public static <T> void argsCheckoutByObject(T t,String ... excludeProperty) throws IllegalAccessException {
        Class<?> tClass = t.getClass();
        List<String> list = Arrays.asList(excludeProperty);
        Field[] declaredFields = tClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            String name = field.getName();
            if (list.contains(name)) continue;

            Object o = field.get(t);
            if (ObjectUtils.isEmpty(o) || StringUtils.isEmpty(o.toString())){
                throw new HyException(ErrorCode.PARAM_ERROR);
            }
        }
    }

    /**
     * 判断是否存在空数据
     * @param args
     */
    public static void argsCheckout(Object ... args){

        Arrays.stream(args).forEach(e->{
            if (ObjectUtils.isEmpty(e)){
                throw new HyException(ErrorCode.PARAM_ERROR);
            }
        });
    }
}
