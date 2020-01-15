package com.gqz.springadvicetype.introductioninterceptor;

import com.gqz.springadvicetype.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description: Spring引介增强测试
 * @Author：ganquanzhong
 * @Date： 2020/1/15 23:16
 */
public class SpringIntroductionInterceptorDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-springintroductioninterceptor.xml");
        Waiter waiterProxy = (Waiter) context.getBean("waiterProxy");
        waiterProxy.serve("Michael");
        Management manager = (Management)waiterProxy;
        manager.manage("Michael");
    }
}
