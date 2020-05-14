package com.bcp.sdp.msp.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @packageName： com.bcp.sdp.msp.eureka
 * @className: EurekaApplication
 * @description: TODO
 * @version: v1.0
 * @author: liuzhichao
 * @date: 2020-04-20 14:48
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("---------->start");
    }
}
