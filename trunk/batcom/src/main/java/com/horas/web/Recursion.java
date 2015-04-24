/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

/**
 *
 * @author jhon
 */
import com.horas.dto.Node;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Recursion {
	List nodeList =new ArrayList();
        
	Recursion(){//Constructor initialization simulation List
            Node node1 = new Node(1,0);  
            Node node2 = new Node(2,1);  
            Node node3 = new Node(3,1);  
            Node node4 = new Node(4,2);  
            Node node5 = new Node(5,2);  
            Node node6 = new Node(6,2);  
            Node node7 = new Node(7,6);  
            Node node8 = new Node(8,6);  

            nodeList.add(node1);  
            nodeList.add(node2);  
            nodeList.add(node3);  
            nodeList.add(node4);  
            nodeList.add(node5);  
            nodeList.add(node6);  
            nodeList.add(node7);  
            nodeList.add(node8);  
	}
	StringBuffer returnStr=new StringBuffer();  
        
    public void recursionFn(List list , Node node){  
        if(hasChild(list,node)){  
            returnStr.append("{id:");
            returnStr.append(node.getId());
            returnStr.append(",parentId:");
            returnStr.append(node.getParentId());
            returnStr.append(",children:[");  
            List childList = getChildList(list,node);  
            Iterator it = childList.iterator();  
            while(it.hasNext()){  
                Node n = (Node)it.next();  
                recursionFn(list,n);  
            }  
            returnStr.append("]},");  
        }else{  
            returnStr.append("{id:");
            returnStr.append(node.getId());
            returnStr.append(",parentId:");
            returnStr.append(node.getParentId());
            returnStr.append(",leaf:true},");  
        }  
          
    }  
    public boolean hasChild(List list, Node node){  //Determine whether the child nodes
    	return getChildList(list,node).size()>0?true:false;
    }
    public List getChildList(List list , Node node){  //Get the list of child nodes
        List li = new ArrayList();  
        Iterator it = list.iterator();  
        while(it.hasNext()){  
            Node n = (Node)it.next();  
            if(n.getParentId()==node.getId()){  
                li.add(n);  
            }  
        }  
        return li;  
    }
    public String modifyStr(String returnStr){//Modified to satisfy the Extjs Json format
    	return ("["+returnStr+"]").replaceAll(",]", "]");
    	
    }
    public static void main(String[] args) {  
        Recursion r = new Recursion();  
        r.recursionFn(r.nodeList, new Node(1,0));  
        System.out.println(r.modifyStr(r.returnStr.toString()));  
    }  
}