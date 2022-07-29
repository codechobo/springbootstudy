package com.example.springbootstudy.filter.config;

import com.example.springbootstudy.filter.web.filter.FirstFilter;
import com.example.springbootstudy.filter.web.filter.SecondFilter;
import com.example.springbootstudy.filter.web.filter.ThirdFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import java.util.List;

/**
 * packageName    : com.example.springbootstudy.filter.config
 * fileName       : WebConfiguration
 * author         : tkdwk567@naver.com
 * date           : 2022/07/29
 */

//@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean<FirstFilter> firstFilterFilterRegistrationBean() {
        FilterRegistrationBean<FirstFilter> registrationBean = new FilterRegistrationBean<>(new FirstFilter());
        registrationBean.setOrder(1);
        registrationBean.setUrlPatterns(List.of("/api/v1/members"));
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<ThirdFilter> thirdFilterFilterRegistrationBean() {
        FilterRegistrationBean<ThirdFilter> registrationBean = new FilterRegistrationBean<>(new ThirdFilter());
        registrationBean.setOrder(10);
        registrationBean.setUrlPatterns(List.of("/api/v1/members"));
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<SecondFilter> secondFilterFilterRegistrationBean() {
        FilterRegistrationBean<SecondFilter> registrationBean = new FilterRegistrationBean<>(new SecondFilter());
        registrationBean.setOrder(5);
        registrationBean.setUrlPatterns(List.of("/api/v1/members"));
        return registrationBean;
    }
}
