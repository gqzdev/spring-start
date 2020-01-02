package com.gqzdev.config;

import com.gqzdev.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName BeanConfig
 * @Description
 * @Author ganquanzhong
 * @Date2020/1/3 0:19
 * @Version
 **/

@Configuration
@ComponentScan("com.gqzdev")
public class BeanConfig {

    @Bean
    public User user(){
        return new User(2020100,"gqzdev","china","spring-start");
    }
}
