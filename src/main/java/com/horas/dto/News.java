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
public class News { 
    private UUID idNews;
    private String title;
    private String news;
    private String author;
    private String source;
    private String cat;
    private String images;
    private Date createDate;
    private Date updateDate;
    private String ipCreate;
    private String ipUpdate;
    private String fileAttach;
    
    public News(){}
    private News(UUID idNews,String title,String news,String author, String source, 
            String cat, String images, Date createDate,
            Date updateDate,String ipCreate,String ipUpdate,String fileAttach){
        this.idNews=idNews;
        this.title=title;
        this.author=author;
        this.cat=cat;
        this.news=news;
        this.source=source;
        this.images=images;
        this.createDate=createDate;
        this.updateDate=updateDate;
        this.fileAttach=fileAttach;
        this.ipCreate=ipCreate;
        this.ipUpdate=ipUpdate;
    }
    
    //setter
    public void setIdNews(UUID idNews){
        this.idNews=idNews;
    }
    public void setNews(String news){
        this.news=news;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setCat(String cat){
        this.cat=cat;
    }
    public void setSource(String source){
        this.source=source;
    }
    
    public void setImages(String images){
        this.images=images;
    }
    
    public void setCreateDate(Date createDate){
        this.createDate=createDate;
    }
    
    public void setUpdateDate(Date updateDate){
        this.updateDate=updateDate;
    }
    public void setIpCreate(String ipCreate){
        this.ipCreate=ipCreate;
    }
    public void setIpUpdate(String ipUpdate){
        this.ipUpdate=ipUpdate;
    }
    public void setFileAttach(String fileAttach){
        this.fileAttach=fileAttach;
    }
    
    //getter
    public UUID getIdNews(){
        return idNews;
    }
    public String getNews(){
        return news;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
         return author;
    }
    public String getCat(){
        return cat;
    }
    public String setSource(){
        return source;
    }
    
    public String getImages(){
         return images;
    }
    
    public Date getCreateDate(){
        return createDate;
    }
    
    public Date getUpdateDate(){
         return updateDate;
    }
    public String getIpCreate(){
        return ipCreate;
    }
    public String getIpUpdate(){
       return ipUpdate;
    }
    public String getFileAttach(){
         return fileAttach;
    }
}
