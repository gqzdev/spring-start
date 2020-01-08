package com.gqz.aop.jdk.xml;

/**
* description: 香蕉
* @Author：ganquanzhong
* @Date： 2020/1/8 22:29
*/
public class Banana implements Fruit {
    /**
     * 吃水果
     */
    @Override
    public void eat() {
        try {
            //模拟吃香蕉的过程
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("吃香蕉");
    }
}
