package com.gqz.jdkdynamicproxy;

/**
 * description: Animal接口实现类Dog---被代理的对象
 * @Author：ganquanzhong
 * @Date： 2020/1/15 23:21
 */
public class Dog implements Animal {
    /**
     * 接口方法
     */
    @Override
    public void eat() {
        System.out.println("Dog需要吃骨头");
    }
}
