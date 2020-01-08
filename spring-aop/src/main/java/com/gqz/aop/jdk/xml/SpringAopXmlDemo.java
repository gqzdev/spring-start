package com.gqz.aop.jdk.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description: xml aop测试
 * 使用xml配置的方式实现aop，
 *
 * @Author：ganquanzhong
 * @Date： 2020/1/8 22:30
 */
public class SpringAopXmlDemo {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("classpath:spring-chapter3-xmlaop.xml");
        Fruit apple = (Fruit) applicationContext.getBean("apple");
        Fruit banana = (Fruit) applicationContext.getBean("banana");
        apple.eat();
        System.out.println("-----休息一会儿-----");
        Thread.sleep(10000);
        banana.eat();
    }
}
