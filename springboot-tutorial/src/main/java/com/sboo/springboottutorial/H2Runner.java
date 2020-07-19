package com.sboo.springboottutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class H2Runner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try(Connection connection = dataSource.getConnection()){
//        connection.setAutoCommit(false);
            System.out.println(connection.getMetaData().getURL());
            System.out.println(connection.getMetaData().getUserName());
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE USER(id INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY(id))";
            statement.executeUpdate(sql);
            //http://localhost:8080/h2-console
        }

        jdbcTemplate.execute("INSERT INTO USER VALUES(1, 'sboo')");
    }
}
