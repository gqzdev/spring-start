package com.gqz.aop.cglib.xml;

/**
 * description: 课桌
 * @Author：ganquanzhong
 * @Date： 2020/1/12 23:12
 */
public class Desk {
    /**
     * 打印位置信息
     */
    public void location () throws InterruptedException {
        //模拟耗时，方便观察输出结果
        Thread.sleep(10000);
        System.out.println("我是课桌desk，我被放在教室中");
    }
}
