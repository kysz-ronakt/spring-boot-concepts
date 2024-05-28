package com.spring.jdbc.springdata.jdbc.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DAOConfig {

    private final JdbcTemplate jdbcTemplate;

    public DAOConfig(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    public void CreateAuthorTable() {

        String sql = "CREATE TABLE IF NOT EXISTS Author ("
                + "id SERIAL PRIMARY KEY,"
                + "first_name VARCHAR(255) NOT NULL,"
                + "last_name VARCHAR(255) NOT NULL,"
                + "email VARCHAR(255) NOT NULL,"
                + "user_name VARCHAR(255) NOT NULL"
                + ");";

        jdbcTemplate.execute(sql);

    }

    @PostConstruct
    public void createPostTable() {

        String sql = "CREATE TABLE IF NOT EXISTS Post ("
                + "id SERIAL PRIMARY KEY, "
                + "version INT, "
                + "title VARCHAR(255) NOT NULL, "
                + "content TEXT NOT NULL, "
                + "published_on TIMESTAMP NOT NULL, "
                + "updated_on TIMESTAMP NOT NULL,"
                +" author int,"
                + "foreign key (author) references Author(id) "
                + ");";

        jdbcTemplate.execute(sql);
    }




}
