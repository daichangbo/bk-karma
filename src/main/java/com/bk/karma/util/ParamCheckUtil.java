package com.bk.karma.util;

import com.bk.karma.annotation.DataInit;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Auther dcb
 * @Date 2020/8/14
 */
public class ParamCheckUtil {

    public static Object doAround(Object oo) throws Exception {
        //获取方法参数注解，返回二维数组是因为某些参数可能存在多个注解
        Class object = oo.getClass();
        if (!(object instanceof Object)) {
            return oo;
        }
        Field[] parameterAnnotations = object.getDeclaredFields() ;
        fillParamDefaultValue (oo,object,parameterAnnotations) ;

        Class suObject = object.getSuperclass();
        Field[] superParameterAnnotations = suObject.getDeclaredFields();
        if (superParameterAnnotations.length == 0) {
            return oo;
        }
        fillParamDefaultValue (oo,suObject,superParameterAnnotations) ;
        return oo;
    }

    private static void fillParamDefaultValue (Object oo,Class object,Field[] files) {
        for (Field sf : files) {
            try {
                //判断值是否为空
                sf.setAccessible(true);
                Object resultValue = sf.get(oo) ;
                if (resultValue != null) {
                    continue;
                }
                fillDefaultValue(sf,oo,object);
            } catch (Exception e) {
            }
        }
    }

    private static Object fillDefaultValue (Field f, Object oo, Class object) throws Exception {
        Method tMethod = fetchMethod(f, oo, object);
        // 调用方法，并将源对象get方法返回值作为参数传入
        DataInit dataInit = f.getAnnotation(DataInit.class);
        if (dataInit == null) {
            return oo;
        }
        String defaultValue = dataInit.defaultValue();

        if (f.getGenericType().toString().equals(
                "class java.lang.String")) {
            tMethod.invoke(oo, defaultValue);
        }
        if (f.getGenericType().toString().equals(
                "class java.lang.Long")) {
            tMethod.invoke(oo, Long.valueOf(defaultValue));
        }
        if (f.getGenericType().toString().equals(
                "class java.lang.Integer")) {
            tMethod.invoke(oo, Integer.valueOf(defaultValue));
        }
        return oo;
    }

    private static Method fetchMethod (Field f, Object oo, Class object) throws Exception {
        f.setAccessible(true);
        // 获取属性的对应的值
        f.setAccessible(true);
        // 获取目标对象的属性名，将属性名首字母大写，拼接如：setUsername、setId的字符串
        String tName = f.getName();
        char[] tChars = tName.toCharArray();
        tChars[0] -= 32;
        String tMethodName = "set" + String.valueOf(tChars);
        // 获得属性的set方法
        return object.getMethod(tMethodName, f.getType());
    }
}
