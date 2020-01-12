package com.gqz.aop.cglib.xml;

/**
 * description: 桌子
 * @Author：ganquanzhong
 * @Date： 2020/1/12 23:12
 */
public class Table {
    /**
     * 打印位置信息
     */
    public void location() throws InterruptedException {
        //模拟耗时，方便观察输出结果
        Thread.sleep(10000);
        System.out.println("我是餐桌table，我被放在厨房中");
    }
}
