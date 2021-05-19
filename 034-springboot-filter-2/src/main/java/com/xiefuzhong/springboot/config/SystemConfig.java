package com.xiefuzhong.springboot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration  //将此类定义为配置类
public class SystemConfig {

    @Bean
    public FilterRegistrationBean characterEncodingFilterRegistrationBean(){

        //创建字符编码过滤器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        //强制使用指定字符编码
        characterEncodingFilter.setForceEncoding(true);
        //设置指定的字符编码
        characterEncodingFilter.setEncoding("utf-8");


        //过滤器的实例注册
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        //设置字符编码过滤器
        filterRegistrationBean.setFilter(characterEncodingFilter);
        //设置字符编码过滤器路径
        filterRegistrationBean.addUrlPatterns("/*");

        return  filterRegistrationBean;
    }



}
