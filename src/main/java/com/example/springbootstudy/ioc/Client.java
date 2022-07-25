package com.example.springbootstudy.ioc;

import org.hibernate.internal.EntityManagerMessageLogger;
import org.springframework.boot.web.servlet.context.WebApplicationContextServletContextAwareProcessor;
import org.springframework.context.ApplicationContext;

/**
 * packageName    : com.example.springbootstudy.ioc
 * fileName       : Client
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */
public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.hello());

        Person person = new Person();
        System.out.println(person.hello());

        Mammal dog1 = new Mammal(new Dog());
        System.out.println(dog1.hello());

        Mammal person1 = new Mammal(new Person());
        System.out.println(person1.hello());



    }
}
