package com.sboo.springboottutorial;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class SpringbootTutorialApplication {
    public static void main(String[] args) {
//        SpringApplication app = new SpringApplicationBuilder()
//                .sources(SpringbootTutorialApplication.class)
//                .banner((environment, sourceClass, out) -> {
//                    out.println("=======================");
//                    out.println("=======================");
//                })
//                .build(args);
//        app.run();

        new SpringApplicationBuilder()
                .sources(SpringbootTutorialApplication.class)
                .banner((environment, sourceClass, out) -> {
                    out.println("=======================");
                    out.println("=======================");
                })
                .run(args);
    }

}
