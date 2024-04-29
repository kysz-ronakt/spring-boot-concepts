package com.dev.httpinterface.httpClient;

import com.dev.httpinterface.user.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;
import java.util.Optional;


public interface UserHttpClient {

    @GetExchange("users")
    List<User> getUsers();


    @GetExchange("/users/{id}")
    Optional<User> getUserById(Long id);
}
