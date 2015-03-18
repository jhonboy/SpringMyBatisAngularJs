/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dto;

/**
 *
 * @author jhon
 */
public class Post {
    
    private int id;
    private String news;
    public Post(){}
    public Post(int id,String news){
        this.id=id;
        this.news=news;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNews(){
        return news;
    }
    public void setNews(String news){
        this.news= news;
    }
    
}
