package com.dev.httpinterface.controller;

import com.dev.httpinterface.httpClient.UserHttpClient;
import com.dev.httpinterface.restClient.UserRestClient;
import com.dev.httpinterface.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

//    private final UserRestClient userRestClient;


    private final UserHttpClient userHttpClient;

    public UserController(UserHttpClient userHttpClient) {
        this.userHttpClient = userHttpClient;
    }


    @GetMapping
    public List<User> getUsers() {
        return userHttpClient.getUsers();
    }

}
