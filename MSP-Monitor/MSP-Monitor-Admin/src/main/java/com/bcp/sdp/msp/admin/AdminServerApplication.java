package com.bcp.sdp.msp.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.net.UnknownHostException;

@EnableAdminServer
@SpringBootApplication
public class AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
        System.out.println("[----------start----------] Admin 访问地址: http://localhost:8010");
        // 打印 IP 地址和端口号
        try {
            String hostAddress = InetAddress.getLocalHost().getHostAddress();
            System.out.println("http://" + hostAddress + ":8010");
        } catch (UnknownHostException e) {
            System.out.println("获取 IP 地址失败");
        }
    }

}
