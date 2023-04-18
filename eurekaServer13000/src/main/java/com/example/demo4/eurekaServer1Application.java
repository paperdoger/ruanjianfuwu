package com.example.eurekaServer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eurekaServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(eurekaServer1Application.class, args);
    }

}
