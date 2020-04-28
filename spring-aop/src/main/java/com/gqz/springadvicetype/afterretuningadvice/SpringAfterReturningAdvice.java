package com.gqz.springadvicetype.afterretuningadvice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * description: Spring AOP后置增强
 *              实现AfterReturningAdvice接口,重写afterReturning方法
 * @Author：ganquanzhong
 * @Date： 2020/1/15 22:58
 */
@Component
public class SpringAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        String methodName = method.getName();
        System.out.printf("AfterReturningAdvice增强的方法返回值是:%s%n", returnValue);
        System.out.printf("AfterReturningAdvice增强的方法是:%s%n", methodName);
        System.out.printf("AfterReturningAdvice增强的方法的参数是:%s%n", args[0]);
        System.out.printf("AfterReturningAdvice增强的对象是:%s%n", target);
    }
}
