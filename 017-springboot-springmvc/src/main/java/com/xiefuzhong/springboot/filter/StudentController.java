package com.xiefuzhong.springboot.web;

import com.xiefuzhong.springboot.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    //该方法支持：get和post请求
    @RequestMapping(value = "/queryStudent")
    public  Object queryStudent(){

        return  "支持get或者post请求方式";
    }

    //该方法仅支持get请求
    @RequestMapping(value = "/queryStudent2",method = RequestMethod.GET)
    public  Object queryStudent2(){
        return "只支持get请求方式";
    }
            //或者这莫写也是等同于上面：该方法仅支持get请求
            @GetMapping(value = "/queryStudent3") //该注解一般在查询数据的时候使用
            public  Object queryStudent3(){
                return "注解的另一种写法，也只支持get请求方式";
            }

     //该方法只支持post请求
//    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @PostMapping(value = "/insert")  //该注解一般在新增数据的时候使用
    public  Object insert(){
        return "Insert success";
    }

//    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @DeleteMapping(value = "/delete")  //该注解一般在删除数据的时候使用
    public  Object delect(){
        return "delete Student";
    }

//    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @PutMapping(value = "/update")  //通常在修改数据的时候使用
    public  Object update(){
        return "update student info";
    }








}
