package com.gqz.springadvicetype.methodinterceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Service;

/**
 * description: AroundAdvice环绕增强
 * @Author：ganquanzhong
 * @Date： 2020/1/15 23:17
 */
@Service
public class SpringMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // 前置增强
        System.out.println("前置增强执行了");
        // 通过反射机制调用目标方法
        Object obj = invocation.proceed();
        // 后置增强
        System.out.println("后置增强执行了");
        return obj;
    }
}
