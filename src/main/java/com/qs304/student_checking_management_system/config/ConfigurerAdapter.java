package com.qs304.student_checking_management_system.config;

import com.qs304.student_checking_management_system.Adapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigurerAdapter implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new Adapter()).addPathPatterns("/index/**").addPathPatterns("/set/**");
    }
}
