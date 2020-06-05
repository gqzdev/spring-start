package com.gqz.aspectj.expression.annotation;

import com.gqz.aspectj.expression.Factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 /**
  * @description:  测试ExecutionAspect切面
  * @Author: ganquanzhong
  * @Date:  2020/1/13 17:45
  */
public class AspectJExpressionDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-aspectjannotationexpression.xml");

        Factory foodFactory = (Factory)context.getBean("foodFactory");
        foodFactory.make();

        System.out.println("-----分割线-----");

        Factory phoneFactory = (Factory) context.getBean("phoneFactory");
        phoneFactory.make();
    }
}
