package com.gqz.aop.jdk.xml;

/**
* description: 苹果
* @Author：ganquanzhong
* @Date： 2020/1/8 22:27
*/
public class Apple implements Fruit {
    /**
     * 吃水果
     */
    @Override
    public void eat() {
        try {
            //模拟吃苹果的过程
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("吃苹果");
    }
}
