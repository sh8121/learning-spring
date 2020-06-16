package com.sboo.springboottutorial;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class SpringbootTutorialApplication {
    public static void main(String[] args) {
        //SpringApplication.run(SpringbootTutorialApplication.class, args);
        SpringApplication app = new SpringApplication(SpringbootTutorialApplication.class);
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                out.println("=========================");
                out.println("=========================");
                out.println("=========================");
                out.println("=========================");
            }
        });
        //app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
