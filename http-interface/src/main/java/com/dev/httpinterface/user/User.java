package com.dev.httpinterface.user;

public record User(
        Integer id,
        String name ,
        String userName,
        Address address ,

        String phone,
        String website

) {
}
