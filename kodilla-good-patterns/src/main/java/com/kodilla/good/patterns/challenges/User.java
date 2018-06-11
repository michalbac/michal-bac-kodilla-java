package com.kodilla.good.patterns.challenges;

public class User {

    private String userName;
    private char sex;
    private String userMail;

    public User(String userName, char sex, String userMail) {
        this.userName = userName;
        this.sex = sex;
        this.userMail = userMail;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public String getUserMail() {
        return userMail;
    }
}
