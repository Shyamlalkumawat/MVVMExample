package com.mvvmexample.model;

/**
 * Created by admin on 19/03/2018.
 */

public class LoginModel {

    private String email;
    private String password;

    public LoginModel() {   // default constructor
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
