package com.spring.jdbc.springdata.jdbc.config;

import jakarta.annotation.PostConstruct;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseIntializer {


    private final JdbcTemplate jdbcTemplate;

    public DatabaseIntializer(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    public void initDatabase(){
        CreateAuthorTable();
        createPostTable();
    }


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

    public void createPostTable() {

        String sql = "CREATE TABLE IF NOT EXISTS Post ("
                + "id SERIAL PRIMARY KEY, "
                + "version INT, "
                + "title VARCHAR(255) NOT NULL, "
                + "content TEXT NOT NULL, "
                + "published_on TIMESTAMP NOT NULL, "
                + "updated_on TIMESTAMP NOT NULL,"
                + " author int,"
                + "foreign key (author) references Author(id) "
                + ");";

        jdbcTemplate.execute(sql);
    }

}
