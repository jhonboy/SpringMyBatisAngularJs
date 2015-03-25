package com.horas.service;

import com.horas.dto.User;
import com.horas.dto.UserDetail;



/**
 * Service to handle Users.
 */
public interface UserService {
    public User getCurrentUser();
    public UserDetail getUserDetail(String username);
    public void signUp(User user,UserDetail userDetail);       
}
