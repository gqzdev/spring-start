package com.gqz.aspectj.expression.execution;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @Author zhouguanya
 * @Date 2018/9/100
 * @Description 使用execution 来为所有Factory接口的实现类织入增强
 */
@Aspect
public class ExecutionAspect {
    @AfterReturning("execution(* com.gqz.aspectj.expression.Factory.*(..))")
    public void make() {
        System.out.println("make方法执行了");
    }
}
