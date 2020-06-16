package com.sboo.springframeworktutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ApplicationConfig {
    @Bean
    public BookService bookService(BookRepository bookRepository) {
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository);
        //bookService.setBookRepository(bookRepository());
        return bookService;
    }

    @Bean BookRepository bookRepository() {
        return new BookRepository();
    }
}
