package com.service.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 10281
 * @title 服务注册中心启动类
 * @Date 2020-11-19 23:22
 * @Description 配置Eureka服务端启动类，用于启动微服务注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCenterApplication.class, args);
    }
}
