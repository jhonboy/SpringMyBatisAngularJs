package com.horas.web;


import com.horas.dto.User;
import com.horas.dto.UserDetail;

import com.horas.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * Controller for user actions.
 */
@Controller
public class UserController {
    
    @Inject
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public User getCurrentUser(HttpServletRequest request, HttpServletResponse response) { 
       HttpSession sess = request.getSession();
       sess.setAttribute("username", userService.getCurrentUser().getName());
       return userService.getCurrentUser();
    }
    
    @RequestMapping(value = "/userDetail/{username}", method = RequestMethod.GET)
    @ResponseBody
    public UserDetail getUserDetail (@PathVariable String username) {
        return userService.getUserDetail(username);
    }

}
