package com.sboo.springboottutorial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Value("${sboo.name}")
    private String name;

    @Value("${sboo.fullName}")
    private String fullName;

    @Value("${sboo.age}")
    private int age;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===================");
        System.out.println(name);
        System.out.println(fullName);
        System.out.println(age);
        System.out.println("===================");
    }
}
