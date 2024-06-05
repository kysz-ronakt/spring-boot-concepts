package com.spring.jdbc.springdata.jdbc.service;

import com.spring.jdbc.springdata.jdbc.config.DAOConfig;
import com.spring.jdbc.springdata.jdbc.dto.AuthorRequestDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final DAOConfig daoConfig;
    private final JdbcTemplate jdbcTemplate;

    public AuthorService(DAOConfig daoConfig, JdbcTemplate jdbcTemplate) {
        this.daoConfig = daoConfig;
        this.jdbcTemplate = jdbcTemplate;
    }


    public void save(AuthorRequestDTO authorRequestDTO) throws Exception {
        jdbcTemplate.update(
                "insert into author (first_name, last_name, email, user_name) VALUES (? , ? ,? ,? )",
                authorRequestDTO.firstName(),
                authorRequestDTO.lastName(),
                authorRequestDTO.email(),
                authorRequestDTO.userName()
        );
    }
}
