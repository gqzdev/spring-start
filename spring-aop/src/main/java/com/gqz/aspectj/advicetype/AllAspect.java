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
     * 将切入点表达式   将advice应用到那些方法上面
     * 抽取成一个方法
     */
    @Pointcut("execution(* com.gqz.aspectj.advicetype.*.*(..))")
    public void allAointCut() {

    }

    /**
     * 前置增强
     */
    @Before("allAointCut()")
    public void before() {
        System.out.println("【@Before 前置通知】 before advice");
    }

    /**
     * 环绕增强
     * @param proceedingJoinPoint
     */
    @Around("allAointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("【@Around 环绕通知1】around advice 1");
        proceedingJoinPoint.proceed();
        System.out.println("【@Around 环绕通知2】around advice 2");
    }

    /**
     * 返回增强
     */
    @AfterReturning("allAointCut()")
    public void afterReturning() {
        System.out.println("【@AfterReturning 返回通知】afterReturning advise");
    }

    /**
     * 异常抛出增强
     */
    @AfterThrowing("allAointCut()")
    public void afterThrowing() {
        System.out.println("【@AfterThrowing 异常通知】afterThrowing advice");
    }

    /**
     * 后置增强
     */
    @After("allAointCut()")
    public void after() {
        System.out.println("【@After 后置通知】after advise");
    }
}
