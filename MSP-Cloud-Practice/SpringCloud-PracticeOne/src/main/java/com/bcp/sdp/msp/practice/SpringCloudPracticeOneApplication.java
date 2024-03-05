package com.bcp.sdp.msp.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudPracticeOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPracticeOneApplication.class, args);
    }

}
