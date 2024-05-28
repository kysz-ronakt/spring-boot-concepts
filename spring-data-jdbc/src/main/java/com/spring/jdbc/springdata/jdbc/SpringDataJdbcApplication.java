package com.spring.jdbc.springdata.jdbc;

import com.spring.jdbc.springdata.jdbc.entity.Post;
import com.spring.jdbc.springdata.jdbc.repository.PostRepository;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringDataJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataJdbcApplication.class, args);
    }
}
