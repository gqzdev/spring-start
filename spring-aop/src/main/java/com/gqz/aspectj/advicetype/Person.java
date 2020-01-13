package com.gqz.aspectj.advicetype;

import org.springframework.stereotype.Component;

 /**
  * @description:  一个Spring Bean, Person 有一个say说方法
  * @Author: ganquanzhong
  * @Date:  2020/1/13 17:30
  */
@Component
public class Person {

    /**
     * 说话的方法
     */
    public void say() {
        System.out.println("Hello gqzdev,this is spring5");
    }
}