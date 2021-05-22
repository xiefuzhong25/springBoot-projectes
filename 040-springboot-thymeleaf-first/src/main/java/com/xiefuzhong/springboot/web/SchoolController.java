package com.xiefuzhong.springboot.web;

import com.xiefuzhong.springboot.model.School;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class SchoolController {

    //便历list集合
    @RequestMapping(value = "/eachList")
    public  String  list(Model model){
        List<School> sList = new ArrayList<>();
        for (int i=0;i<5;i++){
            School school= new School();
            school.setAddress("地址位置"+i);
            school.setId(i);
            school.setName("希望中学第"+i+"附中");
            school.setPhone("11111"+i);
            sList.add(school);
        }
        model.addAttribute("sList",sList);
        return "eachList";
    }

    //便历map集合
    @RequestMapping(value = "/eachMap")
    public  String  eachMap(Model model){
        Map<Integer,Object> map = new HashMap<>();
        for (int i=0;i<5;i++){
            School school= new School();
            school.setAddress("地址位置"+i);
            school.setId(i);
            school.setName("希望高职学第"+i+"附中");
            school.setPhone("11111"+i);
            map.put(i,school);
        }
        model.addAttribute("map",map);
        return  "eachMap";
    }

    //便历数组
    @RequestMapping(value = "/eachArray")
    public  String  eachArray(Model model){
        School[] array = new  School[5];
        for (int i=0;i<5;i++){
            School school= new School();
            school.setAddress("循环便历数组"+i);
            school.setId(i);
            school.setName("希望高职学第"+i+"附中");
            school.setPhone("11111"+i);
           array[i]=school;
        }
        model.addAttribute("array",array);
        return  "eachArray";
    }

    //内敛文本和内敛脚本的使用
    @RequestMapping(value = "/inline")
    public String inline(Model model){
        model.addAttribute("data","SpringBoot inline");
        return "inline";
    }

    //字符串的拼接【分页底部中的运用】
    @RequestMapping(value = "/splice")
    public String splice(Model model){
        model.addAttribute("totalRows",123);
        model.addAttribute("totalPage",25);
        model.addAttribute("currentPage",5);
        return "splice";
    }

    //数学运算
    @RequestMapping(value = "/operator")
    public String operator(Model model){

        model.addAttribute("sex",1);
        return "operator";
    }

    //基本表达式对象的使用【session】
    @RequestMapping(value = "/builtIn")
    public String BuiltIn(HttpServletRequest request,Model model,Integer id){
        model.addAttribute("username","lisi");
        request.getSession().setAttribute("data","sessionData");

        return "builtIn";
    }

    //功能表达式对象的使用
    @RequestMapping(value = "/function")
    public  String  function(Model model){

        model.addAttribute("time",new Date());
        model.addAttribute("data","springboot中的功能表达式的使用");
        return  "function";
    }



}
