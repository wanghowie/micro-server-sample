package service.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 10281
 * @title 服务鉴权启动类
 * @Date 2020-12-09 21:52
 * @Description
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceSecurityApplication.class, args);
    }
}
