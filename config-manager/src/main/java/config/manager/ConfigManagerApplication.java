package config.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 10281
 * @title 配置服务器启动类
 * @Date 2020-11-23 22:27
 * @Description
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigManagerApplication.class, args);
    }
}
