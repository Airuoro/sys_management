package com.airuoro.incloud;

import com.airuoro.incloud.demo.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = UserController.class)
@EnableDiscoveryClient
public class IncloudDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(IncloudDemoApplication.class, args);
    }
}
