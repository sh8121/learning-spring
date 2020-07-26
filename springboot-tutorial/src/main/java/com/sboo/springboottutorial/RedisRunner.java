package com.sboo.springboottutorial;

import com.sboo.springboottutorial.account.Account;
import com.sboo.springboottutorial.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RedisRunner implements ApplicationRunner {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ValueOperations<String, String> valueOps = redisTemplate.opsForValue();
        valueOps.set("sboo", "Sang hoon");
        valueOps.set("springboot", "2.0");
        valueOps.set("hello", "world");

        Account account = new Account();
        account.setEmail("gmail.com");
        account.setUsername("sboo");
        accountRepository.save(account);
        System.out.println(account.getId());
        Optional<Account> byId = accountRepository.findById(account.getId());
        System.out.println(byId.get().getUsername());
        System.out.println(byId.get().getEmail());
    }
}
