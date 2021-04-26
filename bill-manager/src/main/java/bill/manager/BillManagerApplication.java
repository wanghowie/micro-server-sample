package bill.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 10281
 * @title 单据管理启动类
 * @Date 2020-11-19 23:22
 * @Description 配置Eureka服务端启动类，用于启动微服务注册中心
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "bill.manager.feign")
@EnableCircuitBreaker
public class BillManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillManagerApplication.class, args);
    }
}
