package com.xiaomingege.eurekaconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @create 2019/4/23
 * @TINE 21:11
 **/
@Service
public class ConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String helloConsumer() {

        return restTemplate.getForObject("http://eureka-client/hello", String.class);
    }

    public String fallback() {
        return "fallback";
    }
}
