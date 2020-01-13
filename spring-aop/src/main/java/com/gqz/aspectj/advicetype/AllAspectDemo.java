package com.gqz.aspectj.advicetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


 /**
  * @description:  测试各种类型的增强-adviceType
  * @Author: ganquanzhong
  * @Date:  2020/1/13 17:43
  */
public class AllAspectDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-aoptype.xml");
        Person person = (Person) context.getBean("person");
        person.say();
    }
}
