package com.gqz.aspectj.expression.args;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

 /**
  * @description:  args和@args切面逻辑
  * @Author: ganquanzhong
  * @Date:  2020/1/13 17:56
  */
@Aspect
public class ArgsAspect {

    @Before("args(java.lang.String)")
    public void before() {
        System.out.println("args匹配方法入参是String的方法");
    }

    @After("@args(com.gqz.aspectj.expression.args.Listen)")
    public void after() {
        System.out.println("@args匹配到方法执行了");
    }
}
