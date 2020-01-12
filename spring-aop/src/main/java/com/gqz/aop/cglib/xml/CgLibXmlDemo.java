package com.gqz.aop.cglib.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description: cglib aop测试
 * @Author：ganquanzhong
 * @Date： 2020/1/12 23:13
 */
public class CgLibXmlDemo {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("classpath:spring-chapter3-xmlcglib.xml");
        Desk desk = (Desk) applicationContext.getBean("desk");
        Table table = (Table) applicationContext.getBean("table");
        desk.location();

        System.out.println("-----分割线-----");
        Thread.sleep(10000);
        table.location();
    }
}
