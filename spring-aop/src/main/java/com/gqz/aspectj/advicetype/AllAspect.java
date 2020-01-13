package com.gqz.aspectj.advicetype;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

 /**
  * @description: 包含各种增强类型的切面
  *  Pointcut \ Before \ Around \ AfterReturning \AfterThrowing \ After
  * @Author: ganquanzhong
  * @Date:  2020/1/13 17:33
  */
@Component
@Aspect
public class AllAspect {

    /**
     * 切入点
     */
    @Pointcut("execution(* com.gqz.aspectj.advicetype.*.*(..))")
    public void allAointCut() {

    }

    /**
     * 前置增强
     */
    @Before("allAointCut()")
    public void before() {
        System.out.println("before advice");
    }

    /**
     * 环绕增强
     * @param proceedingJoinPoint
     */
    @Around("allAointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around advice 1");
        proceedingJoinPoint.proceed();
        System.out.println("around advice 2");
    }

    /**
     * 后置增强
     */
    @AfterReturning("allAointCut()")
    public void afterReturning() {
        System.out.println("afterReturning advise");
    }

    /**
     * 异常抛出增强
     */
    @AfterThrowing("allAointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice");
    }

    /**
     * 后置增强
     */
    @After("allAointCut()")
    public void after() {
        System.out.println("after advise");
    }
}
