package com.example.springbootstudy;

import com.example.springbootstudy.ioc.ApplicationContextProvider;
import com.example.springbootstudy.ioc.Dog;
import com.example.springbootstudy.ioc.Mammal;
import com.example.springbootstudy.ioc.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootstudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootstudyApplication.class, args);

        ApplicationContext applicationContext = ApplicationContextProvider.getContext();

        Mammal person = applicationContext.getBean(Mammal.class);
        System.out.println(person.hello());

        Mammal dog = applicationContext.getBean( Mammal.class);
        System.out.println(dog.hello());
    }

}
