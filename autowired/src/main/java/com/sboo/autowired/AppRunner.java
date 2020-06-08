package com.sboo.autowired;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(Locale.getDefault());
        System.out.println(messageSource.getMessage("greeting", new String[]{"sboo"}, Locale.KOREA));
        System.out.println(messageSource.getMessage("greeting", new String[]{"sboo"}, Locale.US));
    }
}
