/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.util;


import java.util.UUID;
import static java.util.UUID.randomUUID;
import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author ardodonk
 */
public class RandomUUID {
    private UUID id;
     private HttpServletRequest request;
     String username;
        
    public UUID sys_guid(){
        
        
            return randomUUID();
         
        
    }
}
