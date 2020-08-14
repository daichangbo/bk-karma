//package com.bk.karma.annotation;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.expression.EvaluationContext;
//import org.springframework.expression.spel.standard.SpelExpressionParser;
//import org.springframework.expression.spel.support.StandardEvaluationContext;
//import org.springframework.stereotype.Component;
//import java.lang.reflect.Field;
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Proxy;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//
//@Aspect
//@Component
//public class SensitiveAspect {
//
//    private SpelExpressionParser spelParser = new SpelExpressionParser();
//
//    /**
//     * 返回通知
//     */
//    @AfterReturning("@annotation(com.bk.karma.annotation.DataInit) && @annotation(sensitiveOverride)")
//    public void doAfter(JoinPoint joinPoint, DataInit sensitiveOverride) throws Exception {
//        //获取方法的参数名和参数值
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        List<String> paramNameList = Arrays.asList(methodSignature.getParameterNames());
//        List<Object> paramList = Arrays.asList(joinPoint.getArgs());
//
//        //将方法的参数名和参数值一一对应的放入上下文中
//        EvaluationContext ctx = new StandardEvaluationContext();
//        for (int i = 0; i < paramNameList.size(); i++) {
//            ctx.setVariable(paramNameList.get(i), paramList.get(i));
//        }
//
//        // 解析SpEL表达式获取结果
//        String value = spelParser.parseExpression(sensitiveOverride.key()).getValue(ctx).toString();
//        //获取 sensitiveOverride 这个代理实例所持有的 InvocationHandler
//        InvocationHandler invocationHandler = Proxy.getInvocationHandler(sensitiveOverride);
//        // 获取 invocationHandler 的 memberValues 字段
//        Field hField = invocationHandler.getClass().getDeclaredField("memberValues");
//        // 因为这个字段是 private final 修饰，所以要打开权限
//        hField.setAccessible(true);
//        // 获取 memberValues
//        Map memberValues = (Map) hField.get(invocationHandler);
//        // 修改 value 属性值
//        memberValues.put("userType", Integer.parseInt(value));
//
//    }
//}