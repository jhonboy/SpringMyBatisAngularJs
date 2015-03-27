package com.horas.service.impl;

import com.horas.dao.UserDAO;
import com.horas.dto.User;
import com.horas.dto.UserDetail;
import com.horas.service.PersonService;
import com.horas.service.UserService;
import com.horas.util.ApplicationContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * UserService that accesses the spring credentials.
 */
@Transactional
@Service
public class SpringUserService extends ApplicationContextUtils implements UserService {
    
    @Autowired
    private UserDAO userDAO;
    private String username;
    
    public User getCurrentUser() {
        User u= new User();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !(authentication.getPrincipal() instanceof UserDetails)) {
            return new User();
        }
        System.out.println("USER===="+((UserDetails) authentication.getPrincipal()).getUsername());
        username=((UserDetails) authentication.getPrincipal()).getUsername();
        u.setUsername(username);
        return u;
    }

    public UserDetail getUserDetail(String username) {
       
         UserDetail ud = (UserDetail)getApplicationContext().getBean("userDetail");
         
         ud=userDAO.getUserDetails(username);
                  
         return ud;
    }

    public void signUp(User user) {
          userDAO.signUp(user);
    }

    

 

 
}
