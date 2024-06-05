package com.spring.jdbc.springdata.jdbc.controller;

import com.spring.jdbc.springdata.jdbc.dto.AuthorRequestDTO;
import com.spring.jdbc.springdata.jdbc.service.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }



    @PostMapping
    public void createAuthor(@RequestBody AuthorRequestDTO author) throws Exception {
        authorService.save(author);
    }
}
