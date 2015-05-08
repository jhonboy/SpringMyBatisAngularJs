/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author jhon
 */

public class Moment {
    private UUID idMoment;
    private String username;
    private String moment;
    private String idAlbum;
    private String friendlist;
    private String place;
    private String createDate;
    private Date updateDate;
    private String ipCreate;
    private String ipUpdate;
    private boolean yours;
    private List<Album> albums;
    
    public Moment(){}
    
    public Moment(UUID idMoment,String username,String moment,String idAlbum,String friendlist,String place,String createDate,Date updateDate,String ipCreate,String ipUpdate,List<Album> albums,boolean  yours){
        this.idMoment=idMoment;
        this.username=username;
        this.moment=moment;
        this.idAlbum=idAlbum;
        this.friendlist=friendlist;
        this.place=place;
        this.createDate=createDate;
        this.updateDate=updateDate;
        this.ipCreate=ipCreate;
        this.ipUpdate=ipUpdate;
        this.albums=albums;
        this.yours=yours;
    
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

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
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

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public boolean getYours() {
        return yours;
    }

    public void setYours(boolean yours) {
        this.yours = yours;
    }
 
    
}
