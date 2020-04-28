package com.gqzdev;

import com.gqzdev.app.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
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
        System.out.println("初始化------spring容器");
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(AppConfig.class);
        //无参构造方法，需要手动refresh
        applicationContext.refresh();


        // 添加Listener
        servletContext.addListener(new ContextLoaderListener());

        // 2. init Spring Servlet
        System.out.println("初始化------servlet容器");
        DispatcherServlet servlet = new DispatcherServlet();
        //添加到容器 ServletContext

        ServletRegistration.Dynamic registration = servletContext.addServlet("as",servlet);
        registration.addMapping("/");
        registration.setLoadOnStartup(1);
    }
}
