package com.project.microservicesdcb4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesDcb4Application {

    public static void main(String[] args) {

        SpringApplication.run(MicroservicesDcb4Application.class, args);

    }

}