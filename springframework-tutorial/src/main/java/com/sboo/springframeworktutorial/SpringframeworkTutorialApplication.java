package com.sboo.springframeworktutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringframeworkTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringframeworkTutorialApplication.class, args);
    }
}
