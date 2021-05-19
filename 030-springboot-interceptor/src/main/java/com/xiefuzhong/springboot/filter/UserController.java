package com.xiefuzhong.springboot.web;

import com.xiefuzhong.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")  //为这个控制器所有方法都加一个前缀
public class UserController {

    //用户登录请求
    @RequestMapping(value = "/login")
    public  @ResponseBody Object login(HttpServletRequest request){
        //将用户信息存放到session中
        User user = new User();
        user.setId(1001);
        user.setUsername("lishi");
        request.getSession().setAttribute("user",user);
        return  "登录成功";
    }

    //该请求需要用户登录之后才可以访问
    @RequestMapping(value = "/center")
    public  @ResponseBody Object center(){
        return  "登录之后才可以看到内部资源页面";
    }

    //该请求不登录也可以访问得到
    @RequestMapping(value = "/out")
    public  @ResponseBody Object out(){
        return  "不登录也可以到这个页面";
    }

    //如果用户未登录访问了需要登录才可以访问的请求，之后跳转至该路径
    @RequestMapping( value = "/error")
    public @ResponseBody Object error(){
        return  "error";
    }


}
