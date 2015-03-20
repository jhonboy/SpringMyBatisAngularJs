/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dto;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author jhon
 */

public class Moment {
    private UUID idMoment;
    private String username;
    private String moment;
    private String photo;
    private String friendlist;
    private String place;
    private Date createDate;
    private Date updateDate;
    private String ipCreate;
    private String ipUpdate;
    
    public Moment(){}
    
    public Moment(UUID idMoment,String username,String moment,String photo,String friendlist,String place,Date createDate,Date updateDate,String ipCreate,String ipUpdate){
        this.idMoment=idMoment;
        this.username=username;
        this.moment=moment;
        this.photo=photo;
        this.friendlist=friendlist;
        this.place=place;
        this.createDate=createDate;
        this.updateDate=updateDate;
        this.ipCreate=ipCreate;
        this.ipUpdate=ipUpdate;
    
    }

    public UUID getIdMoment() {
        return idMoment;
    }

    public void setIdMoment(UUID idMoment) {
        this.idMoment = idMoment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFriendlist() {
        return friendlist;
    }

    public void setFriendlist(String friendlist) {
        this.friendlist = friendlist;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getIpCreate() {
        return ipCreate;
    }

    public void setIpCreate(String ipCreate) {
        this.ipCreate = ipCreate;
    }

    public String getIpUpdate() {
        return ipUpdate;
    }

    public void setIpUpdate(String ipUpdate) {
        this.ipUpdate = ipUpdate;
    }
    
    
    
}
