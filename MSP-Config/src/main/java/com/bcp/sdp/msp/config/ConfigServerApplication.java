package com.bcp.sdp.msp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @packageName： com.bcp.sdp.msp.config
 * @className: ConfigApplication
 * @description: TODO
 * @version: v1.0
 * @author: liuzhichao
 * @date: 2020-04-22 15:58
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
        System.out.println("---------->start");
    }
}
