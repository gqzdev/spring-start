package com.gqz.aspectj.expression.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


/**
 * @description: 使用 @annotation() 来为所有加了 @Log 注解的方法织入增强
 * @Author: ganquanzhong
 * @Date: 2020/1/13 17:45
 */
@Aspect
public class AnnotationAspect {

    @Before("@annotation(com.gqz.aspectj.expression.annotation.Log)")
    public void beforeLog() {
        System.out.println("@Log注解的增强---->打印日志--前置增强beforeLog");
    }

    @AfterReturning("@annotation(com.gqz.aspectj.expression.annotation.Log)")
    public void log() {
        System.out.println("@Log注解的增强---->打印日志--后置增强AfterReturning");
    }

}
