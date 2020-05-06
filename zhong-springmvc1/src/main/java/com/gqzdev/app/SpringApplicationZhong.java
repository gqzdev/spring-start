package com.gqzdev.app;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import javax.servlet.ServletException;
import java.io.File;

public class SpringApplicationZhong {

    public static  void run() throws ServletException {

        Tomcat tomcat = new Tomcat();

        tomcat.setPort(9080);

        String sourcePath = SpringApplicationZhong.class.getResource("/").getPath();

        //告诉tomcat你的源码在哪裏
        Context ctx = tomcat.addWebapp("/",new File("src/main/webapp").getAbsolutePath());

        WebResourceRoot resources = new StandardRoot(ctx);

        resources.addPreResources(new DirResourceSet(resources,
                "/META-INF/classes",
                sourcePath, "/"));
        ctx.setResources(resources);

        try {
            tomcat.start();
            tomcat.getServer().await();

        } catch (LifecycleException e) {
            e.printStackTrace();
        }

    }
}
