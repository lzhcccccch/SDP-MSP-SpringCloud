package com.bcp.sdp.msp.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("[----------start----------] Eureka 访问地址: http://localhost:8761");
        // 打印 IP 地址和端口号
        try {
            String hostAddress = InetAddress.getLocalHost().getHostAddress();
            System.out.println("http://" + hostAddress + ":8761");
        } catch (UnknownHostException e) {
            System.out.println("获取 IP 地址失败");
        }
    }

    /**
     * 使用 HTTP 方式进行服务间通信时,实现客户端的负载均衡
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
