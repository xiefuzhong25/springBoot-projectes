package com.xiefuzhong.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component //将此类交给spring容器进行管理
@ConfigurationProperties(prefix = "abc")  //配置属性注解，spring容器会自动将配置文件属性赋值上去
public class Abc {

    private String name;
    private  String websit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsit() {
        return websit;
    }

    public void setWebsit(String websit) {
        this.websit = websit;
    }
}
