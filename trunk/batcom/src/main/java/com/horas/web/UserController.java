package com.horas.web;


import com.horas.dto.ResponseMessage;
import com.horas.dto.Role;
import com.horas.dto.User;
import com.horas.dto.UserDetail;
import com.horas.constant.Common;
import com.horas.constant.Common.GENERAL;

import com.horas.service.UserService;
import com.horas.util.ApplicationContextUtils;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * Controller for user actions.
 */
@Controller
public class UserController extends ApplicationContextUtils{
    
    @Inject
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public ResponseMessage getCurrentUser(HttpServletRequest request, HttpServletResponse response) { 
       
       HttpSession sess = request.getSession();
       sess.setAttribute("username", userService.getCurrentUser().getUsername());
       ResponseMessage rsp;
       
       if(userService.getCurrentUser()!=null){
            rsp=new ResponseMessage(ResponseMessage.Type.info, "suksesLogin");
            System.out.println("Username success"+userService.getCurrentUser().getUsername());
       }else{
            rsp=new ResponseMessage(ResponseMessage.Type.warn, "failedLogin");
            System.out.println("Username gagal"+userService.getCurrentUser().getUsername());
       }
          
           
     
        return rsp;
    }
    
    @RequestMapping(value = "/userDetail/{username}", method = RequestMethod.GET)
    @ResponseBody
    public UserDetail getUserDetail (@PathVariable String username) {
        return userService.getUserDetail(username);
    }

    
    @RequestMapping(value="/signup",method=RequestMethod.POST)
    @ResponseBody
    public ResponseMessage signup(@RequestBody User user){
       UserDetail ud=(UserDetail) getApplicationContext().getBean("userDetail");
       Role role=(Role)getApplicationContext().getBean("role");
       if (user.getUsername().length() <= 3 ) {
            throw new IllegalArgumentException("moreThan3Chars");
       }
       
       if(!user.getPassword().equals(user.getReTypePassword())){
           throw new IllegalArgumentException("passwordNotMatch");
       }
        role.setUsername(user.getUsername());
        role.setRole(GENERAL.ROLE_USER.getValue());
        
        user.setEnabled(true);
        user.setRole(role);
        
        ud.setUsername(user.getUsername());
        ud.setMarga(user.getMarga());
        user.setUserDetail(ud);
        
        userService.signUp(user);
        return new ResponseMessage(ResponseMessage.Type.success, "signupSuccess");   
    }
    @RequestMapping(value = "/user/logout", method = RequestMethod.GET)
    @ResponseBody
    public ResponseMessage logoutUser(HttpServletRequest request, HttpServletResponse response) throws IOException { 
     HttpSession sess= request.getSession(true);
     sess.invalidate();
     //response.sendRedirect("login.html");
     return new ResponseMessage(ResponseMessage.Type.success, "LogoutSuccess");
      
    }
    
}
