/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.constant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jhon
 */
public class GlobalSession {
    private String username;
    private HttpServletRequest request;
    public String getUsername(){
        HttpSession sess=request.getSession();
        username= (String) sess.getAttribute("username");
        return username;
    }
}
