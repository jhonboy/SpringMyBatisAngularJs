/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dto;

/**
 *
 * @author ardodonk
 */
public class Family {
    private int id;
    private int parent_id;
    private String name;
    public Family(){}
    
    public Family(int id,int parent_id,String name){
        this.id=id;
        this.parent_id=parent_id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
