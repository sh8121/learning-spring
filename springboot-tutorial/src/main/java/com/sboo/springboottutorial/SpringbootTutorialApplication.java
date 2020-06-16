package com.sboo.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootTutorialApplication {
    public static void main(String[] args) {
        //SpringApplication.run(SpringbootTutorialApplication.class, args);
        SpringApplication app = new SpringApplication(SpringbootTutorialApplication.class);
        app.run(args);
    }

}
