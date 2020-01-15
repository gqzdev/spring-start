package com.gqz.cglibdynamicproxy;

import org.springframework.cglib.proxy.Enhancer;

/**
 * description:  测试Cglib
 * @Author：ganquanzhong
 * @Date： 2020/1/15 23:19
 */
public class CglibDynamicProxyDemo {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //被代理类：Cat
        enhancer.setSuperclass(Cat.class);
        //设置回调
        enhancer.setCallback(new CatMethodInterceptor());
        //生成代理对象
        Cat cat = (Cat) enhancer.create();
        //调用代理类的方法
        cat.cry();
    }
}
