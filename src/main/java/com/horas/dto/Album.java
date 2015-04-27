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
    private UUID id;//append with extension
    private UUID idMoment;
    private String photo;
    private String extension;
    
    public Album(){}
    public Album(UUID id,UUID idMoment,String photo,String extension){
        this.id=id;
        this.idMoment=idMoment;
        this.photo=photo;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdMoment() {
        return idMoment;
    }

    public void setIdMoment(UUID idMoment) {
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
    
    
}
