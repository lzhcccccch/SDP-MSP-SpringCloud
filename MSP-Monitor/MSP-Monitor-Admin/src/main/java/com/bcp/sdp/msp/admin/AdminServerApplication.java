package com.bcp.sdp.msp.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @packageName： com.bcp.sdp.msp.admin
 * @className: AdminServerApplication
 * @description: TODO
 * @version: v1.0
 * @author: liuzhichao
 * @date: 2020-04-23 10:24
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
        System.out.println("---------->start");
    }
}
