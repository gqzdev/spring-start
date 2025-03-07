package com.gqz.aop.jdk.xml;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
* description: 横切关注点,打印吃水果的时间
* @Author：ganquanzhong
* @Date： 2020/1/8 22:29
*/
public class FruitHandler {

    /**
     * 打印开始吃水果的时间
     */
    public void startEatFruitDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String startEatDate = simpleDateFormat.format(new Date());
        System.out.println("xml-配置开始吃水果的时间是：" + startEatDate);
    }

    /**
     * 打印吃完吃水果的时间
     */
    public void endEatFruitDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String endEatDate = simpleDateFormat.format(new Date());
        System.out.println("xml-配置结束吃水果的时间是：" + endEatDate);
    }
}
