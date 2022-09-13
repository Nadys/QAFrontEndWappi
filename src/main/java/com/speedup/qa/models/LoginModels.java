package com.speedup.qa.models;

public class LoginModels {
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public LoginModels (String user, String password){
    this.user=user;
    this.password=password;

    }
}


