Spring AOP  aspect oriented programming
面向切面编程
Spring AOP的实现   
    通过在程序运行时，根据具体的类对象和方法等信息动态地生成一个代理类的class文件的字节码，
咋u通过ClassLoader将代理类加载到内存中，最后通过生成的代理对象进行程序的方法调用。
AOP前置知识
    1.JDK动态代理：
        创建代理类，动态代理类（必须）需要实现InvocationHandler接口
    2.CGLIB动态代理
            