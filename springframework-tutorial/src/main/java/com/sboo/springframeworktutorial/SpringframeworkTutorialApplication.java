package com.sboo.springframeworktutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringframeworkTutorialApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringframeworkTutorialApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }
}
