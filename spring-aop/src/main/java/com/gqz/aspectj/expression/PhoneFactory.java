package com.gqz.aspectj.expression;

import com.gqz.aspectj.expression.annotation.Log;
import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/9/100
 * @Description 手机工厂
 */

@Component
public class PhoneFactory implements Factory {
    /**
     * 制作产品的方法
     *
     * @Log为自定义的注解，  并且给@Log添加了AfterReturning的aspectj增强
     */
    @Override
    @Log
    public void make() {
        System.out.println("生产手机");
    }

    /**
     * 运输手机的方法
     */
    @Override
    public void delivery(String address) {
        System.out.println("运输手机至" + address);
    }

    /**
     * 测试@Within注解
     */
    public void testWithin() {

    }
 }
