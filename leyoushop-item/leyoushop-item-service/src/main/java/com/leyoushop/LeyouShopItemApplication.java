package com.leyoushop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LeyouShopItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouShopItemApplication.class,args);
    }
}
