package com.example.homework;


public class User {
    private String Login;
    private String Email;

    public User() {

    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public User(String login, String email) {
        Login = login;
        Email = email;
    }

    public boolean inEmail(String email){
        return  (Email.contains(".") & Email.contains( "@"));
    }



}

