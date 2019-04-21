package com.xiaomingege.eurekaconsumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @create 2019/4/20
 * @TINE 15:48
 **/
@RestController
public class ConsumerController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/getProvider")
    public  String helloConsumer(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("hello-server");
        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/hello";
        System.out.println(url);
        System.out.println("111111111111111");
        return  restTemplate.getForObject(url,String.class);
    }
}
