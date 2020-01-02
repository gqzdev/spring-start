package com.gqz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorldControll
 * @Description
 * @Author ganquanzhong
 * @Date2020/1/3 0:34
 * @Version
 **/

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @RequestMapping("hello")
    public String sayHello() {
        return "Hello World";
    }
}
