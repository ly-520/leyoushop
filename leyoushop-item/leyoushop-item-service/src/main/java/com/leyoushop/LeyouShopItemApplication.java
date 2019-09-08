package com.leyoushop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.leyoushop.item.mapper")   //自动扫描不需要每个接口dao再注入
@EnableDiscoveryClient
@SpringBootApplication
public class LeyouShopItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouShopItemApplication.class,args);
    }
}
