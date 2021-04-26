package com.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 10281
 * @title 人员管理启动类
 * @Date 2020-11-19 23:22
 * @Description 配置Eureka服务端启动类，用于启动微服务注册中心
 */
@SpringBootApplication
@EnableEurekaClient
public class UserManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManagerApplication.class, args);
    }

/*    *//**
     * 解决 Hateoas和 swagger 冲突问题
     * @return
     *//*
    @Bean
    public LinkDiscoverers discovers() {
        List<LinkDiscoverer> plugins = new ArrayList<>();
        plugins.add(new CollectionJsonLinkDiscoverer());
        return new LinkDiscoverers(SimplePluginRegistry.create(plugins));

    }*/
}
