package com.gqz.sourcecodelearning;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * description:  Around环绕通知
 * @Author：ganquanzhong
 * @Date： 2020/1/15 23:13
 */
public class LogAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        System.out.println("方法执行开始时间：" + dateFormat.format(new Date()));

        invocation.proceed();
        System.out.println("方法执行结束时间：" + dateFormat.format(new Date()));
        return null;
    }
}
