package com.example.springbootstudy;

import com.example.springbootstudy.interceptor.config.WebInterceptorConfiguration;
import com.example.springbootstudy.ioc.ApplicationContextProvider;
import com.example.springbootstudy.ioc.Dog;
import com.example.springbootstudy.ioc.Mammal;
import com.example.springbootstudy.ioc.Person;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Base64;

@SpringBootApplication
@ServletComponentScan
public class SpringbootstudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootstudyApplication.class, args);
    }
}
