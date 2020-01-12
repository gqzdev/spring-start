package com.gqz.aop.cglib.xml;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * description: 横切关注点,打印开始和结束的时间
 * @Author：ganquanzhong
 * @Date： 2020/1/12 23:12
 */
public class CglibXmlAspect {

    /**
     * 打印事件开始的时间
     */
    public void startDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String startEatDate = simpleDateFormat.format(new Date());
        System.out.println("开始的时间是：" + startEatDate);
    }

    /**
     * 打印事件结束的时间
     */
    public void endDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String endEatDate = simpleDateFormat.format(new Date());
        System.out.println("结束的时间是：" + endEatDate);
    }
}
