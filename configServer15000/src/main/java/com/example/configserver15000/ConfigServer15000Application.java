package com.example.configserver15000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //开启SCC服务器端注解
public class ConfigServer15000Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer15000Application.class, args);
    }

}
