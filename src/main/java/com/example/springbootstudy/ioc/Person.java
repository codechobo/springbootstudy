package com.example.springbootstudy.ioc;

import org.springframework.stereotype.Component;

/**
 * packageName    : com.example.springbootstudy.ioc
 * fileName       : Person
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

@Component
public class Person implements GreetingInter {
    @Override
    public String hello() {
        return "Hello~~";
    }
}
