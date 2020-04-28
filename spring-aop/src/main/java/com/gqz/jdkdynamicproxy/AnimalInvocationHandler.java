package com.gqz.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * description:  动态代理类  实现InvocationHandler接口，重写invoke方法
 * @Author：ganquanzhong
 * @Date： 2020/1/15 23:22
 */
public class AnimalInvocationHandler implements InvocationHandler {
    /**
     * 被代理对象
     */
    private Object target;

    /**
     * 绑定业务对象并返回一个代理类
     * @param target
     * @return
     */
    public Object bind(Object target) {
        this.target = target;
        //通过反射机制，创建一个代理类对象实例并返回。用户进行方法调用时使用
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 接口方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        //方法执行前加一段逻辑
        System.out.println("——————调用前处理——————");
        //调用真正的业务方法
        result=method.invoke(target, args);
        //方法执行前加一段逻辑
        System.out.println("——————调用后处理——————");
        return result;
    }
}
