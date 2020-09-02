package com.sboo.springframeworktutorial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
    @Value("#{1 + 1}")
    private int value;

    @Value("#{'hello' + 'world'}")
    private String greeting;

    @Value("#{1 eq 1}")
    private boolean trueOrFalse;

    @Value("hello")
    private String hello;

    @Value("${my.value}")
    private int myValue;

    @Value("#{${my.value} eq 100}")
    private boolean isMyValue100;

    @Value("#{'spring'}")
    private String spring;

    @Value("#{sample.data}")
    private int sampleData;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("======================");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(trueOrFalse);
        System.out.println(hello);
        System.out.println(myValue);
        System.out.println(isMyValue100);
        System.out.println(spring);
        System.out.println(sampleData);

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression =  parser.parseExpression("2 + 100");
        Integer value = expression.getValue(Integer.class);
        System.out.println(value);
    }
}
