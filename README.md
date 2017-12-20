# spring-cloud-demo
> Spring Cloud 实践之路，力争做到最佳实践。


## 一. 简介 ##

spring-cloud-demo 是我在学习使用Spring-Cloud及其理论过程中，实践的一些项目。

Practice makes perfect.


## 二. 主要特性

- 多 Eurake Server 部署
- RestTemplate + Ribbon 服务调用
- Feign（接口定义）服务调用
- 断路器 Netflix Hystrix

## 三. 模块介绍

| 模块名                 | 介绍                    |
| ------------------- | --------------------- |
| cloud-eureka-server | Euraka Server 服务注册中心  |
| cloud-feign-service | 基于 Feign 的服务调用      |
| cloud-ipaddr-service| Euraka Client 服务提供者  |
| cloud-logger-service| 日志服务        |
| cloud-ribbon-service| 基于 Ribbon 的服务调用                |

## 四. 服务部署情况

#### 4.1 Eureka Server HA 部署
```bash
java -jar cloud-eureka-server-1.0.0-SNAPSHOT.jar
java -jar cloud-eureka-server-1.0.0-SNAPSHOT.jar --spring.profiles.active=eureka-server-2
```
两个节点，互相向对方注册。





## 五. 感谢 ##

Author: 李扬 Frank
   
Email: bookfrank@foxmail.com

Eureka Server URL : [http://cloud.tazine.com](http://cloud.tazine.com)

博客地址：[http://blog.tazine.com](http://blog.tazine.com)