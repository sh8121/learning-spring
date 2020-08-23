package com.sboo.springframeworktutorial;

import com.sboo.out.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.Arrays;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringframeworkTutorialApplication {

    @Autowired
    MyService myService;

    public static void main(String[] args) {
        var app = new SpringApplication(SpringframeworkTutorialApplication.class);
        //원하는 ApplicationContext를 주입 받아 사용.
        //프로그래밍적인 컨트롤 가능.
        //리플렉션, 프록시를 사용하지 않기 때문에
        //Application 구동시 성능상 이점
        //@Bean을 대체하는 수준으로 사용 추천.
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
            ctx.registerBean(MyService.class);
            ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition"));
        });
        app.run(args);
    }
}
