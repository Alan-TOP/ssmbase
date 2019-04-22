package com.alan.ssmbase.controller;

import com.alan.ssmbase.model.SysUsers;
import com.alan.ssmbase.service.SysUsersService;
import com.alan.ssmbase.utils.PropertyPlaceholder;
import org.apache.log4j.Logger;
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
    Logger logger = Logger.getLogger(HelloRestController.class);

    @Autowired
    private SysUsersService sysUsersService;

    @RequestMapping("/hello")
    public SysUsers restHello(){
        return  sysUsersService.selectByPrimaryKey(111);
    }

    @RequestMapping("/getPro")
    public String getPro(){
        return PropertyPlaceholder.getProperty("users");
    }

    @RequestMapping(value = "/save", produces = "text/plain;charset=UTF-8")
    public String save(){
        SysUsers sysUsers =new SysUsers();
        sysUsers.setCode("kele");
        sysUsersService.insert(sysUsers);
        return "保存成功";
    }
    @RequestMapping(value = "/update", produces = "text/plain;charset=UTF-8")
    public String update(){
        SysUsers sysUsers =new SysUsers();
        sysUsers.setId(111);
        sysUsers.setCode("kele111");
        sysUsersService.updateByPrimaryKeySelective(sysUsers);
        return "更新成功";
    }
}
