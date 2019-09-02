package com.leyoushop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LeyoushopRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyoushopRegistryApplication.class, args);
    }

}
