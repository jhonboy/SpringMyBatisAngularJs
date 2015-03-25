/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.User;
import com.horas.dto.UserDetail;

/**
 *
 * @author ardodonk
 */
public interface UserDAO {
    public UserDetail getUserDetails(String username);
    public void signUp(User user,UserDetail userDetail);
}
