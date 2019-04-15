package com.alan.ssmbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Alan
 * @create: 2019-04-15 15:16
 **/
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){

        return "hello";
    }
}
