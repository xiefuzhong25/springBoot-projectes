package com.xiefuzhong.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public  @ResponseBody Object userDetail(){
        return  "/user/* 经过了过滤器";
    }

    @RequestMapping(value = "/center")
    public  @ResponseBody Object center(){
        return  "/center没有经过过滤器";
    }


}
