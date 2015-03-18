/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jhon
 */
public class FamilyTree<T> implements Iterable<FamilyTree<T>> {
    
    
    
    T data;
    FamilyTree<T> parent;
    List<FamilyTree<T>> children;

    public FamilyTree(T data) {
        this.data = data;
        this.children = new LinkedList<FamilyTree<T>>();
    }

    public FamilyTree<T> addChild(T child) {
        FamilyTree<T> childNode = new FamilyTree<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }
    
    public Iterator<FamilyTree<T>> iterator() {
      
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
             
       return null; 
    }
    

    public static void main (String[] args){
            FamilyTree<String> root=new FamilyTree<String>("root");
            List<FamilyTree<String>> test=new ArrayList<FamilyTree<String>>();
            
            
            test.add(root.addChild("horas"));
            test.add(root.addChild("jhon"));
            
            test.add(test.get(0).addChild("hahah"));
            test.add(test.get(1).addChild("heheh"));
            
            root.addChild("test");
            
            System.out.println("children"+root.children.get(0).data);
            System.out.println("anak si horas "+test.get(0).children.get(0).data);
            System.out.println("anak si jhon "+test.get(1).children.get(0).data);
        
  
 
 
//        TreeNode<String> root = new TreeNode<String>("root");
//        {
//            TreeNode<String> node0 = root.addChild("node0");
//            
//            TreeNode<String> node1 = root.addChild("node1");
//            TreeNode<String> node2 = root.addChild("node2");
//            {
//               TreeNode<String> node20 = node2.addChild(null);
//               TreeNode<String> node21 = node2.addChild("node21");
//                {
//                  TreeNode<String> node210 = node20.addChild("node210");
//                }
//            }
//        }
       
         
    }




}

