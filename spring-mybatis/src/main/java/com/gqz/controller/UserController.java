package com.gqz.controller;

import com.gqz.bean.User;
import com.gqz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description
 * @Author ganquanzhong
 * @Date2020/2/2 21:28
 * @Version
 **/
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/{uid}")
    public User getUser(Integer uid){
       return  userMapper.select(uid);
    }
}
