# Dubbo

## 为什么要使用Dubbo

- 服务治理框架
- 服务的监控
- 服务的注册发现
- 服务的通信
- 服务的容错
- 服务的负载均衡



spring cloud alibaba

- Dubbo
- seata
- recketMQ
- Nacos
- Sentinel



# Dubbo怎么去使用

> 先做一个最原始的dubbo来看看。 当然先做已经不会有人这么用dubbo了。主要因为简单可以先了解下dubbo。

参考`dubbo-client-sample` 和 `dubbo-server-sample`

## 发布一个服务

发布服务之后，提供一个**协议+ip+端口+路径**的对外暴露接口

`dubbo://192.168.1.10:20880/org.example.ILoginService`

对比http协议

`http://127.0.0.1:8080/sys/user/add`

## dubbo支持的注册中心

- consul
- zookeeper
- eureka
- redis
- etcd
- nacos
- ....

