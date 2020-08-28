package com.sboo.springframeworktutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext context;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = context.getEnvironment();
        System.out.println(environment.getProperty("app.name"));
        System.out.println(environment.getProperty("app.about"));
    }
}
