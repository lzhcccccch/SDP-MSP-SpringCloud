package com.bcp.sdp.msp.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudPracticeThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPracticeThreeApplication.class, args);
    }

}
