package com.gqz.aspectj.expression.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

 /**
  * @description:  自定义日志注解
  * @Author: ganquanzhong
  * @Date:  2020/1/13 17:56
  */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Log {
    boolean value() default true;
}
