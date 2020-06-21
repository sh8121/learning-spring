package com.sboo.jpatutorial;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

//    @Transactional
    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User();
        user.setUsername("kkobuk");
        user.setPassword("kkobuk");

        Session session = entityManager.unwrap(Session.class);
        session.save(user);
    }
}
