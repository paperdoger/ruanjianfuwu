package com.example.demo10.Entity;

import lombok.Data;

@Data
public class User {
    private Integer user;
    private String userID;
    private String password;

    public User(Integer user, String userID, String password) {
        this.user = user;
        this.userID = userID;
        this.password = password;
    }
}
