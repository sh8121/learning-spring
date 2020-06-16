package com.sboo.springframeworktutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    BookRepository bookRepository;

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //Error
//    public void setBooksRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
}
