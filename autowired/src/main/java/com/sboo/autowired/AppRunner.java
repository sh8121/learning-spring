package com.sboo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(validator.getClass());
        Event event = new Event();
        event.setLimit(-1);
        event.setEmail("asgasdf");
        Errors errors = new BeanPropertyBindingResult(event, "event");
        validator.validate(event, errors);
        System.out.println(errors.hasErrors());
        errors.getAllErrors().forEach(e -> {
            System.out.println("========error code=======");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
    }
}
