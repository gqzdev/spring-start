package com.gqz;

import com.gqz.config.AppConfig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.lang.reflect.AnnotatedArrayType;

/**
 * @ClassName Test
 * @Description
 * @Author ganquanzhong
 * @Date2020/1/3 23:40
 * @Version
 **/
public class Test {

//    public void testAnnotation(){
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
//        for (String name:beanDefinitionNames){
//            System.out.println("--->"+name);
//        }
//    }

    public void testXML(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring.xml", "spring/spring-mvc.xml");
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String name:beanDefinitionNames){
            System.out.println("--->"+name);
        }
    }

    public static void main(String[] args){
        Test test = new Test();
        //test.testAnnotation();
        System.out.println("===========================");
        test.testXML();
    }
}
