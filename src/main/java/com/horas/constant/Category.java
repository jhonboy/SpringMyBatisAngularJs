/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.constant;

/**
 *
 * @author jhon
 */
public class Category {
    
        public enum Cat {
            /**
             *
             */
            ELEC(1,"Elektronik"), OTO(2,"Otomotif"), SPORT(3,"Alat-alat Olahraga");

            private int value;
            private String desc;

        private Cat(int value,String desc) {
            this.value = value;
            this.desc=desc;
        }
        public void setDesc(String desc){
            this.desc=desc;
        
        }
        public void setValue(int value){
            this.value=value;
        }
        
        public String getDesc(){
            return desc;
        }
        public int getValue(){
            return value;
        }
    }


  
    
}
