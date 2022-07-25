package com.example.springbootstudy.ioc;

import org.springframework.stereotype.Component;

/**
 * packageName    : com.example.springbootstudy.ioc
 * fileName       : Dog
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

@Component
public class Dog implements GreetingInter{

    @Override
    public String hello() {
        return "bark bark~";
    }
}
