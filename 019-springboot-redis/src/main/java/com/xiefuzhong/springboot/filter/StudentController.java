package com.xiefuzhong.springboot.web;


import com.xiefuzhong.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class StudentController {


    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/put")
    public  @ResponseBody Object put(String key,String value){

        studentService.put(key,value);
        return "值已经成功放入redis";
    }

    @RequestMapping(value = "/get")
    public  @ResponseBody  String get(){
        String value = studentService.get("count");
        return  "数据中的count的value为："+ value;
    }





}
