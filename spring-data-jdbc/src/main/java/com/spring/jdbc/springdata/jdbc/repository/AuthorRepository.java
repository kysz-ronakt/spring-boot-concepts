package com.spring.jdbc.springdata.jdbc.repository;

import com.spring.jdbc.springdata.jdbc.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
