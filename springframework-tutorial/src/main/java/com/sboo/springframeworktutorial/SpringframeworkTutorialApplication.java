package com.sboo.springframeworktutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.Arrays;

public class SpringframeworkTutorialApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        BookService bookService1 = context.getBean(BookService.class);
        BookService bookService2 = (BookService)context.getBean("bookService");
        BookRepository bookRepository1 = context.getBean(BookRepository.class);
        BookRepository bookRepositoty2= bookService1.getBookRepository();

        System.out.println(bookService1);
        System.out.println(bookService2);

        System.out.println(bookRepository1);
        System.out.println(bookRepositoty2);
    }

}
