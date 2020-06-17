package com.sboo.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootTutorialApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootTutorialApplication.class);
        app.addListeners(new SampleListener());
        //app.setWebApplicationType(WebApplicationType.REACTIVE);
        app.run(args);
    }
}
