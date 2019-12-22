package com.qs304.student_checking_management_system.config;

import com.qs304.student_checking_management_system.Adapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableRedisHttpSession
public class ConfigurerAdapter implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new Adapter()).addPathPatterns("/index/**").addPathPatterns("/set/**");
    }
}
