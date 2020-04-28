package com.gqz.sourcecodelearning;

/**
 * description: 目标对象
 * @Author：ganquanzhong
 * @Date： 2020/1/15 23:15
 */
public class Target implements Log {

    /**
     * 操作方法
     */
    @Override
    public void printLog() {
        try {
            //模拟一个耗时1秒的操作
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行一些操作");
    }
}
