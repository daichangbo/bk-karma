package com.bk.karma.test;

import com.alibaba.fastjson.JSON;
import com.bk.karma.annotation.DataInit;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Auther dcb
 * @Date 2020/8/11
 */
@Slf4j
@RequestMapping("/single")
@RestController
//@Scope("prototype")
public class SingleTest {

    private int num;

    @RequestMapping("/add")
    public int add() {
        System.out.println(++num);
        return num;
    }

    @RequestMapping("/reduce")
    public int reduce() {
        System.out.println(--num);
        return num;
    }

    @RequestMapping("/dataTest")
    public LessonIndexDto dataTest() throws Exception {
        LessonIndexDto lessonIndexDto = new LessonIndexDto();
        lessonIndexDto.setAnswerUserCount(1L);
        lessonIndexDto.setSignInCount("测试");
        doAround(lessonIndexDto);
        log.info("dataTest result", JSON.toJSONString(lessonIndexDto));
        return lessonIndexDto;
    }

    public Object doAround(Object oo) throws Exception {
        //获取方法参数注解，返回二维数组是因为某些参数可能存在多个注解
        Class object = oo.getClass();
        if (!(object instanceof Object)) {
            return oo;
        }
        Field[] parameterAnnotations = object.getDeclaredFields();
        for (Field f : parameterAnnotations) {
            try {
                //判断值是否为空
                f.setAccessible(true);
                Object resultValue = f.get(oo);
                if (resultValue != null) {
                    continue;
                }
                fillDefaultValue(f, oo, object);
            } catch (Exception e) {
            }
        }
        Class suObject = object.getSuperclass();

        Field[] supPa = suObject.getDeclaredFields();
        for (Field sf : supPa) {
            System.out.println(sf);
        }
        return oo;
    }

    private Object fillDefaultValue(Field f, Object oo, Class object) throws Exception {
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

    private Method fetchMethod(Field f, Object oo, Class object) throws Exception {
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
