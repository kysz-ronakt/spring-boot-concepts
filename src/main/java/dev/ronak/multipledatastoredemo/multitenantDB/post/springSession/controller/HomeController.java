package dev.ronak.multipledatastoredemo.multitenantDB.post.springSession.controller;


import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    private final  String home_view_count = "HOME_VIEW_COUNT";

    @GetMapping("/")
    public String home(Principal principal, HttpSession httpSession){

        incrementCount(httpSession, home_view_count);
        return "hey" + principal.getName();
    }

    @GetMapping("/count")
    public String count(HttpSession httpSession){
        return "home_view_count: "+ httpSession.getAttribute(home_view_count);
    }

    private void incrementCount(HttpSession httpSession, String attribute) {

        var homeViewCount = httpSession.getAttribute(attribute) == null? 0 : httpSession.getAttribute(attribute);
        httpSession.setAttribute(attribute, homeViewCount );
    }

}
