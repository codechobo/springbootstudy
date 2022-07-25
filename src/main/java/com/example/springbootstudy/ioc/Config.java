package com.example.springbootstudy.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * packageName    : com.example.springbootstudy.ioc
 * fileName       : Config
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

@Configuration
public class Config {

    @Bean("mammalPerson")
    public Mammal dog(Person person) {
        return new Mammal(person);
    }

    @Bean("mammalDog")
    public Mammal dog(Dog dog) {
        return new Mammal(dog);
    }
}
