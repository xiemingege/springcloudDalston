package com.xiaominge.eurekaserver.project;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @auther 谢敏
 * @create 2019/4/18
 * @TINE 22:42
 **/
@RestController
public class HelloCroller {
    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloCloud() {
        return "say hello";
    }
}
