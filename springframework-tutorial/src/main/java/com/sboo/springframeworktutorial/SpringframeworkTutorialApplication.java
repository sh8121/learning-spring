package com.sboo.springframeworktutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringframeworkTutorialApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringframeworkTutorialApplication.class, args);
    }
}
