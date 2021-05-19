package com.xiefuzhong.springboot.config;

import com.xiefuzhong.springboot.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration   //定义此类为配置文件（即相当于之前的xml配置文件）
public class InterceptorConfig implements WebMvcConfigurer {

//mvc:interceptors 声明拦截器可以有0或者多个
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //要拦截的路径
        String[] addPathPatterns = {
                "/user/**"

        };
        //不要拦截的路径
        String[] excludePathPatterns = {
                "/user/login",
                "/user/error",
                "/user/out"

        };

//mvc:interceptors  声指明一个拦截器对象，里面有要拦截的对象以及url
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);



    }
}
