package com.gqzdev.app;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 通过集成WebApplicationInitializer  启动tomcat容器
 *
 * @ClassName: MyWebApplication
 * @author: ganquanzhong
 * @date: 2020/4/28 17:37
 */
public class MyWebApplication implements WebApplicationInitializer {
    /**
     *  1. init Spring Context
     *  2. init Spring Servlet
     */

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
       // 1. init Spring Context
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(AppConfig.class);

        // 1. init Spring Servlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet();

        //添加到容器 ServletContext
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet", dispatcherServlet);

        registration.addMapping("/");
        registration.setLoadOnStartup(1);
    }
}
