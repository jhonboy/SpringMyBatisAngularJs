/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dto;

/**
 *
 * @author jhon
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String middleName;
    private String phone;
    private String email;
    private String address;
    private int status;
    
    public Customer(){}
    
    public Customer(String firstName,String lastName,String middleName,String phone,String email,String address,int status){
        this.firstName=firstName;
        this.lastName=lastName;
        this.middleName=middleName;
        this.phone=phone;
        this.email=email;
        this.address=address;
        this.status=status;
    }
    
    public void setFirstName(String firstName){this.firstName=firstName;}
    public String getFirstName(){return firstName;}
    public void setLastName(String lastName){this.lastName=lastName;}
    public String getLastName(){return lastName;}
    public void setMiddleName(String middleName){this.middleName=middleName;}
    public String getMiddleName(){return middleName;}
    public void setPhone(String phone){this.phone=phone;}
    public String getPhone(){return phone;}
    public void setEmail(String email){this.email=email;}
    public String getEmail(){return email;}
    public void setAddress(String address){this.address=address;}
    public String getAddress(){return address;}
    public void setStatus(int status){this.status=status;}
    public int getStatus(){return status;}
            
}
