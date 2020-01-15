package com.gqz.springadvicetype.throwsadvice;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/9/2
 * @Description
 */
/**
 * description:  异常抛出增强
 *              实现ThrowsAdvice接口
 * @Author：ganquanzhong
 * @Date： 2020/1/15 23:17
 */
@Component
public class SpringThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception e)  throws  Throwable{
        System.out.printf("异常抛出增强执行：%s%n", e);
    }
}
