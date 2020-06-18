package com.sboo.springboottutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    private String hello;

    @Autowired
    private SbooProperties sbooProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===================");
        System.out.println(hello);
        System.out.println(sbooProperties.getName());
        System.out.println(sbooProperties.getFullName());
        System.out.println("===================");
    }
}
