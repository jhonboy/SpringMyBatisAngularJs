/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dto;

/**
 *
 * @author ardodonk
 */
public class UserDetail {
    private String userName;
    private String firstName;
    private String middleName;
    private String lastName;
    
    public UserDetail(){}
    public UserDetail(String userName,String firstName,String middleName,String lastName){
        this.userName=userName;
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
