package com.xiefuzhong.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    @ResponseBody
    public  String say(){
        return "springboot  集成spring ok!";
    }

    @RequestMapping(value = "/mapvalue")
    public  @ResponseBody Map<String,Object> mapvalue(){
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("message","springboot project");
        return  retMap;
    }

}
