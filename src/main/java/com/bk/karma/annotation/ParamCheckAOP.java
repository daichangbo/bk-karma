package com.bk.karma.annotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


@Component
@Aspect
public class ParamCheckAOP {

    /**
     * 定义有一个切入点，范围为web包下的类
     */
    @Pointcut("execution(public * com.bk.karma.test.*.*(..))")
    public void checkParam() {
    }

    /**
     * 方法执行前执行
     *
     * @param joinPoint
     */
    @Before("checkParam()")
    public void doBefore(JoinPoint joinPoint) {
    }

    @Around("checkParam()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        Object oo = pjp.proceed();
        MethodSignature signature = ((MethodSignature) pjp.getSignature());
        //获取方法参数注解，返回二维数组是因为某些参数可能存在多个注解
        Class object = signature.getReturnType();
        if (!(object instanceof Object)) {
            return oo;
        }
        Field[] parameterAnnotations = object.getDeclaredFields();
        for (Field f : parameterAnnotations) {
            try {
                //判断值是否为空
                f.setAccessible(true);
                Object resultValue = f.get(oo) ;
                if (resultValue != null) {
                    continue;
                }
                fillDefaultValue(f,oo,object);
            } catch (Exception e) {
            }
        }
        return oo;
    }

    private Object fillDefaultValue (Field f, Object oo, Class object) throws Exception {
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

    private Method fetchMethod (Field f, Object oo, Class object) throws Exception {
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

    /**
     * 在切入点return内容之后切入内容（可以用来对处理返回值做一些加工处理）
     * TODO 留着做以后处理返回值用
     *
     * @param joinPoint
     */
    @AfterReturning(value = "checkParam()", returning = "result")
    public void doAfterReturning(JoinPoint joinPoint, Object result) {

    }

}
