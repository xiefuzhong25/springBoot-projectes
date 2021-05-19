package com.xiefuzhong.springboot.web;

import com.xiefuzhong.springboot.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@Controller
@RestController  //相当于控制层类上加@Controller+方法 方法上加@responseBody【意味着当前控制层所有方法返回的都是JSON对象】
public class StudentController {


    @RequestMapping(value = "/student")
//    @ResponseBody
    public  Object student(){
        Student student = new Student();
        student.setName("zhangsan");
        student.setId(1001);
        student.setAge(25);
        return student;
    }

//--------------------------------------主题开始------------------------------------------------------------

    //这种就是restful风格，把请求参数放在请求路径上，在使用@PathVariable来获取参数的值
    @RequestMapping(value = "/student/{id}/{age}")
    public  Object student1(@PathVariable("id") Integer id,
                            @PathVariable("age") Integer age) {
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("age",age);
        return  map;
    }

    @RequestMapping(value = "/student/{id}/{status}") //在增加一个这个方法参数名不一样而已的话，会报错
    public  Object student2(@PathVariable("id") Integer id,
                            @PathVariable("status") Integer status) {
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("status",status);
        return  map;
    }

    //以上代码两个方法会出现请求路径迷糊错误
    //通常在RESTful风格中方式的请求方式会按照增删改查的请求方式来区分
    //或者修改请求路径
    //RESUful请求风格要求路劲中使用的单词都是名词，最好不要出现动词
//==========================================所以要这莫写，运用017项目的指示=============================

    //    @RequestMapping(value = "/student/{id}/{age}")
        @GetMapping(value = "/student/{id}/{age}")
        public  Object student3(@PathVariable("id") Integer id,
                                @PathVariable("age") Integer age) {
            Map<String,Object> map = new HashMap<>();
            map.put("id",id);
            map.put("age",age);
            return  map;
        }

    //    @RequestMapping(value = "/student/{id}/{status}")
        @DeleteMapping(value = "/student/{id}/{status}")
        public  Object student4(@PathVariable("id") Integer id,
                                @PathVariable("status") Integer status) {
            Map<String,Object> map = new HashMap<>();
            map.put("id",id);
            map.put("status",status);
            return  map;
        }




}
