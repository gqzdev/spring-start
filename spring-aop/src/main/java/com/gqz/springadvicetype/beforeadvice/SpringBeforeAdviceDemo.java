package com.gqz.springadvicetype.beforeadvice;

import com.gqz.springadvicetype.Waiter;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description:  Spring  @Before前置增强测试
 * @Author：ganquanzhong
 * @Date： 2020/1/15 22:51
 */
public class SpringBeforeAdviceDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-springaoptype.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        SpringBeforeAdvice advice = (SpringBeforeAdvice) context.getBean("springBeforeAdvice");

        //Spring提供的代理工厂
        ProxyFactory pf = new ProxyFactory();
        //设置代理目标
        pf.setTarget(waiter);
        pf.addAdvice(advice);
        //生成代理实例
        Waiter proxy = (Waiter)pf.getProxy();
        proxy.serve("Michael");
        proxy.serve("Tommy");
    }
}
