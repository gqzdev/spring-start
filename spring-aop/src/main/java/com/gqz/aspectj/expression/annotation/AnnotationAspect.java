package com.gqz.aspectj.expression.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;


 /**
  * @description:  使用 @annotation() 来为所有加了 @Log 注解的方法织入增强
  * @Author: ganquanzhong
  * @Date:  2020/1/13 17:45
  */
@Aspect
public class AnnotationAspect {
    @AfterReturning("@annotation(com.gqz.aspectj.expression.annotation.Log)")
    public void log() {
        System.out.println("打印日志");
    }
}
