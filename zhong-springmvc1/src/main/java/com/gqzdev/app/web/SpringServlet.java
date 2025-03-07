package com.gqzdev.app.web;

import com.gqzdev.app.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * description:
 * @Author：ganquanzhong
 * @Date： 2020/4/28 22:31
 */

public class SpringServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //"/index.html"

        //classpath
        String basePath = SpringServlet.class.getResource("/").getPath();
        String fileName = request.getRequestURI();
        String path = basePath+fileName;

        File file= new File(path);
        InputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[2048];
        inputStream.read(bytes);

        inputStream.close();
        String str = new String(bytes);
        System.out.println(str);
        response.setContentType("text/html");
        response.getWriter().write(str);


    }
}
