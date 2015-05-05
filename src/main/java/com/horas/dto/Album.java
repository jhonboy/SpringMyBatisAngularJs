 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dto;

import java.util.UUID;

/**
 *
 * @author jhon
 */
public class Album {
    private String id;//append with extension
    private String idMoment;
    private String photo;
    private String extension;
    private String username;
    
    public Album(){}
    public Album(String id,String idMoment,String photo,String extension,String username){
        this.id=id;
        this.idMoment=idMoment;
        this.photo=photo;
        this.extension=extension;
        this.username=username;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMoment() {
        return idMoment;
    }

    public void setIdMoment(String idMoment) {
        this.idMoment = idMoment;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
