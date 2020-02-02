一、使用Spring MVC的xml配置
spring和springMVC的整合：
1、不整合：需要将spring所管理的内容都交给springMVC管理，这样会造成业务逻辑混乱
2、整合：spring的配置文件什么时候加载？怎么加载？
解决方法：监听器，可以再ServletContext加载时，通过监听器加载spring的配置文件，创建spring容器
spring提供的监听器：ContextLoaderListener

3、bean被创建两次的问题：在springMVC中只扫描控制层，在spring中，通过包含或排除对所扫描的包进行指定

4、spring和springMVC的关系：
spring是父容器
springMVC是子容器
规定：子容器能够调用访问父容器中的bean，而父容器不能够调用访问子容器中的bean

springMVC          spring
controller-----service-----dao

spring:Root WebApplicationContext: startup date [Fri Jun 21 11:45:00 CST 2019]; root of context hierarchy
springMVC:WebApplicationContext for namespace 'springDispatcherServlet-servlet': startup date [Fri Jun 21 11:47:42 CST 2019]; 
parent: Root WebApplicationContext

二、也可以使用JavaConfig（全注解配置方式）