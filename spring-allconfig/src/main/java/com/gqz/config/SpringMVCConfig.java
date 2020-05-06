package com.gqz.config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

import java.nio.charset.Charset;
import java.util.List;

/**
 * @ClassName: SpringMVCConfig
 *             SpringMVC中主要配置 视图解析器、JSON 解析、文件上传……等等
 * @author: ganquanzhong
 * @date: 2020/1/6 13:23
 */
@Configuration
@ComponentScan(basePackages = "com.gqz",
        useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = Controller.class)})
public class SpringMVCConfig extends WebMvcConfigurationSupport {

    /**
     * 通过很简单的配置使得 Spring MVC 有能力处理对静态资源进行处理。
     * 在 Spring MVC 中，资源的查找、处理使用的是   责任链设计模式（Filter Chain）
     * *
     *  重写 addResourceHandlers 方法，在这个方法中配置静态资源过滤，
     *  这里我将静态资源放在 resources 目录下，所以资源位置是 classpath:/ ，当然，资源也可以放在 webapp 目录下，此时只需要修改配置中的资源位置即可。
     *  如果采用 Java 来配置 SSM 环境，一般来说，可以不必使用 webapp 目录，除非要使用 JSP 做页面模板，否则可以忽略 webapp 目录。
     */


    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/");
    }

    /**
     *  配置静态资源的处理
     */
    @Override
    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     *  配置视图解析器
     *  把handler方法返回值解析为实际的物理视图
     */
    @Override
    protected void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/pages/", ".jsp");
    }
    /**
     *  直接将Controller请求映射到View视图
     */
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello3").setViewName("hello");
    }

    /**
     * 配置JSON
     * JSON 库要在 SpringMVC 中自动返回或者接收 JSON，都必须提供和自己相关的 HttpMessageConverter
     */
    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        converter.setDefaultCharset(Charset.forName("UTF-8"));
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setCharset(Charset.forName("UTF-8"));
        converter.setFastJsonConfig(fastJsonConfig);
        converters.add(converter);
    }
}
