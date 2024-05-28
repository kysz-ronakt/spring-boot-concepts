package com.spring.jdbc.springdata.jdbc.repository;

import com.spring.jdbc.springdata.jdbc.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
}
