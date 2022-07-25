package com.example.springbootstudy.ioc;

/**
 * packageName    : com.example.springbootstudy.ioc
 * fileName       : Mammal
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

public class Mammal {

    private GreetingInter greeting;

    public Mammal(GreetingInter greeting) {
        this.greeting = greeting;
    }

    public String hello() {
        return greeting.hello();
    }
}
