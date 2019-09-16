package com.leyoushop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LeyoushopUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyoushopUploadApplication.class);
    }
}
