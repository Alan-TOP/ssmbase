package com.alan.ssmbase.controller;

import com.alan.ssmbase.model.SysUsers;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.beans.DesignMode;

/**
 * @description:
 * @author: Alan
 * @create: 2019-04-15 15:16
 **/
@Controller
public class HelloController {
    Logger logger = Logger.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello(){
        logger.info("hello 好的");
        return "hello";
    }

    /**
     * 变量方式传值
     * @return
     */
    @RequestMapping("/bianLiang")
    public String bianLiang(){
        logger.info("bianLiang");
        return "bianLiang";
    }
    @RequestMapping("/bianLiangForm")
    public String bianLiangForm(HttpServletRequest request, String username,String password){
        logger.info(username+"*****"+password);
        request.setAttribute("info", "Normal server recv:"+username+" "+password);
        return "bianLiang";
    }

    /**
     * 变量方式传值（设置别名）
     * @return
     */
    @RequestMapping("/bianLiang1")
    public String bianLiang1(){
        logger.info("bianLiang1");
        return "bianLiang1";
    }
    @RequestMapping("/bianLiangForm1")
    public String bianLiangForm1(HttpServletRequest request, @RequestParam("username") String name, @RequestParam("password") String pass){
        logger.info(name+"*****"+pass);
        request.setAttribute("info", "Normal server recv(别名):"+name+" "+pass);
        return "bianLiang1";
    }

    @RequestMapping("/duiXiang")
    public String duiXiang(){
        logger.info("duiXiang");
        return "duiXiang";
    }
    @RequestMapping("/duiXiangForm")
    public String duiXiangForm(HttpServletRequest request, SysUsers users){
        logger.info(users.getUsername()+"*****"+users.getPassWord());
        request.setAttribute("info", "Normal server recv:"+users.getUsername()+" "+users.getPassWord());
        return "duiXiang";
    }

    @RequestMapping("/shuZu")
    public String shuZu(){
        logger.info("数组 好的");
        return "shuZu";
    }
    @RequestMapping("/shuZuForm")
    public String shuZuForm(HttpServletRequest request,@RequestParam("username") String[] usernames){
        StringBuffer sb=new StringBuffer();
        if(usernames != null)
        {
            sb.setLength(0);
            for(int i=0;i<usernames.length;i++){
                logger.info(i+"*****"+usernames[i]);
                sb.append(usernames[i]);
            }
        }
        request.setAttribute("info", "Normal server recv:"+sb.toString());
        return "shuZu";
    }

    @RequestMapping("/json")
    public String json(){
        logger.info("hello 好的");
        return "json";
    }
    @RequestMapping(value = "/jsonForm",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String jsonForm(HttpServletRequest request,@RequestBody SysUsers users){
        logger.info("jsonForm 好的");
        return "Normal server recv:"+users.getUsername()+users.getPassWord()+users.getEmail();
    }
}
