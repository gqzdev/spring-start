package com.gqz.aspectj.expression;

/**
 * description: 工厂接口
 * @Author：ganquanzhong
 * @Date： 2020/1/14 23:53
 */
public interface Factory {
    /**
     * 制作产品
     */
    void make();

    /**
     * 运输
     */
    void delivery(String address);
}
