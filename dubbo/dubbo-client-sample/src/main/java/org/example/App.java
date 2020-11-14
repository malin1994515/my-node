package org.example;

import org.apache.dubbo.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // 1. 只要实例化ILoginService 那么 login 服务就可以用了
        // 2. 但是 dubbo-client-sample 和 dubbo-server 本质上是两个进程，这就涉及到跨进程调用。
        // 3. 那么相互调用必然要一个 组件 来做这件事情 （以前两个进程通讯 手写Socket，那么这个组件就是我们手写的 Socket协议），
        // 但是这样做只是石器时代的操作。现在这个组件肯定有高级的RPC框架了。
        //      3.1 首先让 dubbo-server 暴露在网络上，所以这里我们就要使用Dubbo RPC框架。
        //      3.2 然后 dubbo-client 也需要用同一种RPC框架才能和 dubbo-server进行通讯。
        //      3.3 接下来就是 dubbo-server 暴露服务，是通过在resources/META-INF/spring/application.xml
        // 4. 当dubbo-server 服务暴露出来后（dubbo://127.0.0.1:20880/org.example.ILoginService），dubbo-client 只要找到访问这个URL即可
        // ILoginService loginService = null;
        // 5. 因为是通过 spring 的xml配置所有当然可以用spring的方式注入
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/application.xml");
        ILoginService loginService = context.getBean(ILoginService.class);
        System.out.println(loginService.login("admin", "admin"));
    }
}
