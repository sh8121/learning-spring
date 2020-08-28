package com.sboo.springframeworktutorial;


import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Profile("!prod & test")
public class TestBookRepository implements BookRepository {
}
