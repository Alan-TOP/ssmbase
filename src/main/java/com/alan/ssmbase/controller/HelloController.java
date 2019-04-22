package com.alan.ssmbase.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Alan
 * @create: 2019-04-15 15:16
 **/
@Controller
public class HelloController {
    Logger logger = Logger.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello(HttpRequest request){
        logger.info("hello 好的");

        return "hello";
    }
}
