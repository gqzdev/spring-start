package com.gqzdev.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * @ClassName: SpringServletContainerInitializer
 * @author: ganquanzhong
 * @date: 2020/5/6 15:41
 */
public class SpringServletInitializer extends org.springframework.web.SpringServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> webAppInitializerClasses, ServletContext servletContext) throws ServletException {
        //super.onStartup(webAppInitializerClasses, servletContext);
        System.out.println("启动  SpringServletContainerInitializer");
    }
}
