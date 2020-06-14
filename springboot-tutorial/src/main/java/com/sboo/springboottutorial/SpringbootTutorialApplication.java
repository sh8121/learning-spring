package com.sboo.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



//@ComponentScan
//@SpringBootConfiguration
//@EnableAutoConfiguration

//@Configuration
//@ComponentScan

@SpringBootApplication
public class SpringbootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootTutorialApplication.class);
//        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);

        //SpringApplication.run(SpringbootTutorialApplication.class, args);
    }

}
