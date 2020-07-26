package com.sboo.springboottutorial.account;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;



//@SpringBootTest
@DataJpaTest // : Slicing Test 일때 Integration Test 일때 연결되는 Driver 비교
class AccountRepositoryTest {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void di() throws SQLException {
        Account account = new Account();
        account.setUsername("sboo");
        account.setPassword("sboo");
        Account savedAccount = accountRepository.save(account);
        assertNotNull(savedAccount.getId());
        Optional<Account> byUsername = accountRepository.findByUsername(savedAccount.getUsername());
        assertThat(byUsername).isPresent();
        //assertNotNull(byUsername);

        Optional<Account> wrong = accountRepository.findByUsername("dfdfdf");
        assertThat(wrong).isEmpty();
        //assertNull(wrong);
    }

}