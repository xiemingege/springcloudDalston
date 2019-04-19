package com.xiaominge.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProjectServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProjectServerApplication.class, args);
    }

}
