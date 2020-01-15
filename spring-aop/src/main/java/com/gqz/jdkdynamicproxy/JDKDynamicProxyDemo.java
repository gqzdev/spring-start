package com.gqz.jdkdynamicproxy;


/**
 * description: 测试JDK动态代理
 * @Author：ganquanzhong
 * @Date： 2020/1/15 23:11
 */
public class JDKDynamicProxyDemo {
    public static void main(String[] args) {
        //被代理对象
        Dog dog = new Dog();
        //动态代理类对象
        AnimalInvocationHandler animalInvocationHandler = new AnimalInvocationHandler();
        //代理对象
        Animal proxy = (Animal) animalInvocationHandler.bind(dog);
        proxy.eat();
    }
}
