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
        Account account = new Account();
        account.setUsername("kkobuk1");
        account.setPassword("kkobuk1");

        Study study = new Study();
        study.setName("Spring Data Jpa");

        account.addStudy(study);

        Session session = entityManager.unwrap(Session.class);
        session.save(account);
        session.save(study);

        Account kkobuk = session.load(Account.class, account.getId());
        //Select Query 발생하지 않음.

        kkobuk.setUsername("kkobuk2");
        kkobuk.setUsername("kkobuk3");
        kkobuk.setUsername("kkobuk4");
        //kkobuk.setUsername("kkobuk1");
        //객체의 변경 사항에 대한 Update가 알아서 일어남.

        System.out.println("=========================");
        System.out.println(kkobuk.getUsername());
    }
}
