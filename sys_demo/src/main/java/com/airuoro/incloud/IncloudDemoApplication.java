package com.airuoro.incloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class IncloudDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(IncloudDemoApplication.class, args);
    }
}
