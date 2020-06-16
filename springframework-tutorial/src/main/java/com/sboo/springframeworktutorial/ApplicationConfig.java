package com.sboo.springframeworktutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ApplicationConfig {
    @Bean
    public BookService bookService(BookRepository bookRepository) {
        return new BookService();
    }

    @Bean BookRepository bookRepository() {
        return new BookRepository();
    }
}
