package com.github.kairocesar.hoteldoormanager;

public class User {

    private int acessCode;

    UserCategory userCategory = UserCategory.UNKNOW;

    public User(UserCategory userCategory, int acessCode) {
        this.acessCode = acessCode;
        this.userCategory = userCategory;
    }
}
