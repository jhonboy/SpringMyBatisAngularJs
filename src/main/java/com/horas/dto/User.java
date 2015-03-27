package com.horas.dto;

/**
 * Contains user data.
 */
public class User {
    
    private String username;
    private String marga;
    private String password;
    private String reTypePassword;
    private boolean enabled;
    private String email;
    
    private UserDetail userDetail;
    private Role role;
    
    public User(){}
    public User(String username,String marga,String password,String reTypePassword,String email,boolean enabled,Role role,UserDetail userDetail) {
        this.username = username;
        this.marga=marga;
        this.password=password;
        this.reTypePassword=reTypePassword;
        this.email=email;
        this.enabled=enabled;
        this.role=role;
        this.userDetail=userDetail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getMarga() {
        return marga;
    }

    public void setMarga(String marga) {
        this.marga = marga;
    }

    public String getReTypePassword() {
        return reTypePassword;
    }

    public void setReTypePassword(String reTypePassword) {
        this.reTypePassword = reTypePassword;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }
    
    
}
