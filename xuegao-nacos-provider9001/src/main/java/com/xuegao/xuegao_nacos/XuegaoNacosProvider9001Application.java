package com.xuegao.xuegao_nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XuegaoNacosProvider9001Application {

    public static void main(String[] args) {
        SpringApplication.run(XuegaoNacosProvider9001Application.class, args);
    }

}
