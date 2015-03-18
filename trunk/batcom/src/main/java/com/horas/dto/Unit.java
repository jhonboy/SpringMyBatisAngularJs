/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dto;

/**
 *
 * @author jhon
 */
public class Unit {
    private String id;
    private String name;
    private String detail;
    private long amount;
    private long price;
    private int category;
    public Unit(){}
    
    public Unit(String id, String name, String detail, long amount,long price,int category){
        this.id=id;
        this.name=name;
        this.detail=detail;
        this.amount=amount;
        this.price=price;
        this.category=category;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setDetail(String detail){
        this.detail=detail;
    }
    public String getDetail(){
        return detail;
    }
    public void setAmount(long amount){
        this.amount=amount;
    }
    public long getAmount(){
        return amount;
    }
    public void setPrice(long price){
        this.price=price;
    }
    public long getPrice(){
        return price;
    }
    public void setCategory(int category){
        this.category=category;
    }
    public int getCategory(){
        return category;
    }
}
