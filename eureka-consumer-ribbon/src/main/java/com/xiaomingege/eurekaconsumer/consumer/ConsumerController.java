package com.xiaomingege.eurekaconsumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther 谢敏
 * @create 2019/4/20
 * @TINE 15:48
 **/
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/getConsumerRibbon")
    public  String helloConsumer(){
        return restTemplate.getForObject("http://eureka-client/hello", String.class);
    }
}
