/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dto;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author ardodonk
 */
public class Comment {
    private UUID idComment;
    private UUID idNews;
    private String comment;
    private String userComment;
    private Date dateComment;
    private String ipComment;
    
    public Comment(){}
    public Comment(UUID idComment,UUID idNews,String comment,String userComment,Date dateComment,String ipComment){
        this.idComment=idComment;
        this.idNews=idNews;
        this.comment=comment;
        this.userComment=userComment;
        this.dateComment=dateComment;
        this.ipComment=ipComment;
    }
    public void setIdComment(UUID idComment){
        this.idComment=idComment;
    }
    public void setIdNews(UUID idNews){
        this.idNews=idNews;
    }
    public void setComment(String comment){
        this.comment=comment;
    }
    public void setUserComment(String userComment){
        this.userComment=userComment;
    }
    
    public void setDateComment(Date dateComment){
        this.dateComment=dateComment;
    }
    public void setIpComment(String ipComment){
        this.ipComment=ipComment;
    }
    
    public UUID getIdComment(){
        return idComment;
    }
    public UUID getIdNews(){
        return idNews;
    }
    public String getComment(){
       return comment;
    }
    public String getUserComment(){
        return userComment;
    }
    
    public Date getDateComment(){
        return dateComment;
    }
    public String getIpComment(){
        return ipComment;
    }
}
