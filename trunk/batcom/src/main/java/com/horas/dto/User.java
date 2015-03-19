package com.horas.dto;

/**
 * Contains user data.
 */
public class User {
    
    private String name;
    private String marga;
    private String password;
    private boolean enabled;
    private String email;
    private String role;
    
//    private UserDetail userDetail;
//    
    public User(){}
    public User(String name,String marga,String password,String email,boolean enabled,String role) {
        this.name = name;
        this.marga=marga;
        this.password=password;
        
        this.email=email;
        this.enabled=enabled;
        this.role=role;
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
    
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMarga() {
        return marga;
    }

    public void setMarga(String marga) {
        this.marga = marga;
    }
    
}
