package com.systop.bean;

import java.io.Serializable;

public class User implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String userName;
    private String userAge;
    private String userSex;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserAge() {
        return userAge;
    }
    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
    public String getUserSex() {
        return userSex;
    }
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
    @Override
    public String toString() {
        return "User [userName=" + userName + ", userAge=" + userAge + ", userSex=" + userSex + "]";
    }



}
