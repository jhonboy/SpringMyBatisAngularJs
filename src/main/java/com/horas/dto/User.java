package com.horas.dto;

/**
 * Contains user data.
 */
public class User {
    
    private String name;
    private String password;
    private String email;
    
//    private UserDetail userDetail;
//    
    public User(String name,String password,String email) {
        this.name = name;
        this.password=password;
        this.email=email;
 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public UserDetail getUserDetail() {
//        return userDetail;
//    }
//
//    public void setUserDetail(UserDetail userDetail) {
//        this.userDetail = userDetail;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     
}
