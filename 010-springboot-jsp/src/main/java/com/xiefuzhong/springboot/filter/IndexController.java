package com.xiefuzhong.springboot.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    private ModelAndView say(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Hello springboot配置的jsp 视图");
        mv.setViewName("say");
        return  mv;
    }

//    第二种写法，拆开model和view
    @RequestMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("message","一样的跳转视图  拆开model和view的一种写法");
        return "say";
    }
}
