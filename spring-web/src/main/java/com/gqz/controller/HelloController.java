package com.gqz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloWorldControll
 * @Description
 * @Author ganquanzhong
 * @Date2020/1/3 0:34
 * @Version
 **/

@Controller
public class HelloController {

    /**
     *  返回JSON数据乱码
     *  解决方法：produces = "text/html;charset=UTF-8"
     */
    @ResponseBody
    @RequestMapping(value = "mvc", produces = "text/html;charset=UTF-8")
    public String sayHello() {
        return "Spring MVC作为前端控制器！";
    }

    @RequestMapping("hello")
    public String print(Model model){
        model.addAttribute("msg","Hello This is Spring Web Project");
        return "index";
    }
}
