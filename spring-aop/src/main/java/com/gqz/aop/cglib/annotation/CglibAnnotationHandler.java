package com.gqz.aop.cglib.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * description: 横切关注点,打印开始和结束的时间
 *          Aspect声明切面，Pointcut定义切点，Before设置前置通知，After设置后置通知
 * @Author：ganquanzhong
 * @Date： 2020/1/15 22:42
 */
@Component
@Aspect
public class CglibAnnotationHandler {
    /**
     * 定义切点
     * execution表达式
     * execution(<修饰符模式>?<返回类型模式> <方法名模式>(<参数模式>) <异常模式>?)
     *
     */
    @Pointcut("execution(* com.gqz.aop.cglib.annotation.*.*(..))")
    public void location() {

    }

    /**
     * 前置通知
     * 打印开始时间
     */
    @Before("location()")
    public void startEatFruitDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String startEatDate = simpleDateFormat.format(new Date());
        System.out.println("开始的时间是：" + startEatDate);
    }

    /**
     * 后置通知
     * 打印结束的时间
     */
    @After("location()")
    public void endEatFruitDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String endEatDate = simpleDateFormat.format(new Date());
        System.out.println("结束的时间是：" + endEatDate);
    }
}
