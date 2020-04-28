package com.gqz.springadvicetype.introductioninterceptor;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;


/**
 * description:  manage经理类
 * @Author：ganquanzhong
 * @Date： 2020/1/15 23:16
 */
public class Manager extends DelegatingIntroductionInterceptor implements Management {

    @Override
    public void manage(String name) {
        System.out.println(name + "，您好，我是经理，负责管理服务员");
    }
}
