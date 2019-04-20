package com.xiaominge.eurekaserver.project;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @auther 谢敏
 * @create 2019/4/18
 * @TINE 22:42
 **/
@RestController
public class HelloCroller {
    @Autowired
    DiscoveryClient discoveryClient;
    private final Logger logger = Logger.getLogger(getClass());

    @GetMapping("/hello")
    public String helloCloud() {
        String servies = "Services: " + discoveryClient.getServices();
        System.out.println("servies");
        return servies;
    }

}
