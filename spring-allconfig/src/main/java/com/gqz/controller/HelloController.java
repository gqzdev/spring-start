package com.gqz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HelloController
 * @author: ganquanzhong
 * @date: 2020/1/6 11:55
 */

@Controller
public class HelloController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello,JSON 格式";
    }

    /**
     * 返回hello.jsp视图
     */
    @GetMapping("/hello2")
    public String hello2(){
        return "hello";
    }

}
