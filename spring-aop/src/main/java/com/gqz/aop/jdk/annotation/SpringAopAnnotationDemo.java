package com.gqz.aop.jdk.annotation;

import com.gqz.aop.jdk.xml.Fruit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description: xml aop测试
 * @Author：ganquanzhong
 * @Date： 2020/1/10 23:26
 */
public class SpringAopAnnotationDemo {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("classpath:spring-chapter3-annotationaop.xml");
        Fruit apple = (Fruit) applicationContext.getBean("apple");
        Fruit banana = (Fruit) applicationContext.getBean("banana");
        apple.eat();
        System.out.println("-----休息一会儿-----");
        Thread.sleep(10000);
        banana.eat();
    }
}
