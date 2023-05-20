package com.example.eurekaServer13000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eurekaServer13000Application {

    public static void main(String[] args) {
        SpringApplication.run(eurekaServer13000Application.class, args);
    }

}
