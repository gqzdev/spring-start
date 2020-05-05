package com.gqzdev;

import com.gqzdev.app.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(AppConfig.class);
        //无参构造方法，需要手动refresh
        ac.refresh();


        // 管理applicationContext的lifecycle   添加Listener
        //servletContext.addListener(new ContextLoaderListener(ac));


        // 2. init Spring Servlet   // Create and register the DispatcherServlet
        System.out.println("初始化------servlet容器 Create and register the DispatcherServlet");
        DispatcherServlet servlet = new DispatcherServlet(ac);
        //添加到容器 ServletContext
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet",servlet);
        registration.addMapping("/");
        registration.setLoadOnStartup(1);
    }
}
