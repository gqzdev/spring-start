package com.gqz.springadvicetype;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * description:  服务员类
 * @Author：ganquanzhong
 * @Date： 2020/1/15 22:52
 */
@Component
public class Waiter {
    /**
     * 服务
     * @param name
     */
    public String serve(String name) {
        System.out.println(name + ",您好，很高兴为您服务。");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return name + ",您好，现在是北京时间" + format.format(new Date());
    }

    /**
     * 开车
     * @param name
     */
    public void driving(String name) {
        throw new RuntimeException(name + "，您好，禁止酒后驾车！");
    }
}
