package com.xiaomingege.eurekaconsumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2019/4/20
 * @TINE 15:48
 **/
@RestController
public class ConsumerController {
    @Autowired
    private HelloDao helloDao;
    @GetMapping("/getProvider")
    public  String helloConsumer(){
        return  helloDao.consumer();
    }
}
