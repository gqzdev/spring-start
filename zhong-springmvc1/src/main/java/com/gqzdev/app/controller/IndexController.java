package com.gqzdev.app.controller;

import com.gqzdev.app.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @ClassName IndexController
 * @Description
 * @Author ganquanzhong
 * @Date2020/4/28 21:36
 * @Version
 **/

@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("/user")
    public User index(){
        return new User(231232,"spring mvc","china","001");
    }
}
