package com.xuegao.xuegao_order_nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XuegaoNacosOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuegaoNacosOrderApplication.class, args);
    }

}
