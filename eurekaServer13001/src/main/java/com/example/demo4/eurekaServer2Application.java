package com.example.eurekaServer13001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eurekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
    }

}
