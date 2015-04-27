/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.constant;

import com.horas.util.RandomUUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jhon
 */
public class GlobalSession extends RandomUUID{
    private String username;
    private HttpServletRequest request;
    public String getUsername(){
        HttpSession sess=request.getSession();
        username= (String) sess.getAttribute("username");
        if(username==null || username.equals("")){
            throw new IllegalArgumentException("harusLogin");
        }
        return username;
    }
}
