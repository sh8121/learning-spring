package com.sboo.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootTutorialApplication.class);
        app.run(args);
    }
}
