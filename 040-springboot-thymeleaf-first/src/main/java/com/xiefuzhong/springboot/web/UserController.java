package com.xiefuzhong.springboot.web;

import com.xiefuzhong.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

//    springboot刚集成thymeleaf
    @RequestMapping(value = "/thymeleaf/index")
    public String index(Model model) {
        model.addAttribute("data","SpringBoot 成功集成 Thymeleaf 模版！");
        return "index";
    }

//    变量表达式的使用
    @RequestMapping(value = "/user/detail")
    public ModelAndView userDetail(){
        ModelAndView mv = new ModelAndView();

        User user = new User();
        user.setId(1001);
        user.setAge(22);
        user.setUserName("lisi");

        mv.addObject("user",user);
        mv.setViewName("userDetail");
        return  mv;
    }

//    URL路径表达式
    @RequestMapping(value = "/url")
    public String url(Model model) {
        model.addAttribute("id",1001);
        model.addAttribute("age",29);
        model.addAttribute("username","zhansan");
        return "url";
    }

    @RequestMapping(value = "/test")
    public  @ResponseBody String test(String username){
        return  "参数是"+username;
    }

    @RequestMapping(value = "/test1")
    public  @ResponseBody String test1(String username,Integer id,Integer age){
        return  "参数是"+username+",id"+id+",年龄"+age;
    }

    //RESTful风格的路径请求
    @RequestMapping(value = "/test2/{id}/{username}")
    public  @ResponseBody String test2(@PathVariable("id") Integer id,
                                       @PathVariable("username") String username){
        return  "id="+id+"姓名："+username;
    }

    //实现引入js和img文件【一般做这个功能的话最好是clear一下，防止一些加载不出来】
    @RequestMapping(value = "/url2")
    public  String url2(){
        return  "url2";
    }




}
