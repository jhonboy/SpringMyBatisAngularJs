/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dto;

/**
 *
 * @author jhon
 */
public class Node {
    
	private int id;
	private int parentId;
        
	public Node(){}
	public Node(int id,int parentId){
		this.id=id;
		this.parentId = parentId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
}