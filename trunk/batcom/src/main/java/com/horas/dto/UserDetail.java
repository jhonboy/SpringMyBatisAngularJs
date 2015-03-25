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
    private String username;
    private String firstname;
    private String middlename;
    private String lastname;
    private String marga;
    private String alamat;
    private char status;
    private char gender;
    
    public UserDetail(){}
    public UserDetail(String username,String firstname,String middlename,String lastname,String marga, String alamat, char gender,char status){
        this.username=username;
        this.firstname=firstname;
        this.middlename=middlename;
        this.lastname=lastname;
        this.marga=marga;
        this.alamat=alamat;
        this.gender=gender;
        this.status=status;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddleName(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMarga() {
        return marga;
    }

    public void setMarga(String marga) {
        this.marga = marga;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
}
