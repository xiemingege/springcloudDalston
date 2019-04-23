package com.xiaomingege.eurekaconsumer.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @create 2019/4/21
 * @TINE 16:22
 **/
@FeignClient("eureka-client")
public interface HelloDao {
    @GetMapping("/hello")
    String consumer();
}
