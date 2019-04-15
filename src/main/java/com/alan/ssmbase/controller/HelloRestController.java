package com.alan.ssmbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Alan
 * @create: 2019-04-15 14:53
 **/
@RestController
@RequestMapping("/rest")
public class HelloRestController {

    @RequestMapping("/hello")
    public  String restHello(){
        return  "aa";
    }
}
