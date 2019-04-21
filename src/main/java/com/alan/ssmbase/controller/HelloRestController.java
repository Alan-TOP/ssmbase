package com.alan.ssmbase.controller;

import com.alan.ssmbase.service.SysUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Alan
 * @create: 2019-04-15 14:53
 **/
@RestController
@RequestMapping("/rest")
public class HelloRestController {
    @Autowired
    private SysUsersService sysUsersService;

    @RequestMapping("/hello")
    public  String restHello(){
        return  sysUsersService.get(111);
    }
}
