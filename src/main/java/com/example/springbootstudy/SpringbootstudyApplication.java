package com.example.springbootstudy;

import com.example.springbootstudy.ioc.ApplicationContextProvider;
import com.example.springbootstudy.ioc.Dog;
import com.example.springbootstudy.ioc.Mammal;
import com.example.springbootstudy.ioc.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Base64;

@SpringBootApplication
public class SpringbootstudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootstudyApplication.class, args);

        System.out.println(Base64.getEncoder().encodeToString("test1234".getBytes()));
    }
}
