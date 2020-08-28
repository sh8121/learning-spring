package com.sboo.springframeworktutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class SpringframeworkTutorialApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringframeworkTutorialApplication.class, args);
    }
}
