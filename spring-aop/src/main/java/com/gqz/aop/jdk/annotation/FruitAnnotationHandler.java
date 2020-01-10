package com.gqz.aop.jdk.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * description: 横切关注点,打印吃水果的时间
 *    使用注解的方式实现
 *      @Aspect、@Pointcut、@After、@Before
 * @Author：ganquanzhong
 * @Date： 2020/1/10 23:09
 */
@Component
@Aspect
public class FruitAnnotationHandler {
    /**
     * 定义切点
     */
    @Pointcut("execution(* com.gqz.aop.jdk.xml.Fruit.*(..))")
    public void eatFruit() {

    }

    /**
     * 前置通知
     * 打印开始吃水果的时间
     */
    @Before("eatFruit()")
    public void startEatFruitDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String startEatDate = simpleDateFormat.format(new Date());
        System.out.println("注解--开始吃水果的时间是：" + startEatDate);
    }

    /**
     * 后置通知
     * 打印吃完吃水果的时间
     */
    @After("eatFruit()")
    public void endEatFruitDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String endEatDate = simpleDateFormat.format(new Date());
        System.out.println("注解--结束吃水果的时间是：" + endEatDate);
    }
}
