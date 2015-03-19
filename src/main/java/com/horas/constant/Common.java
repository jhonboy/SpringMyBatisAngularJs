/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.constant;

/**
 *
 * @author jhon
 */
public class Common {
    public enum common {
            /**
             *
             */
            MALE('M',"Pria"), FEMALE('F',"Perempuan"), MARRIED('M',"Menikah"),SINGLE('S',"Single");

            private char value;
            private String desc;

        private common(char value,String desc) {
            this.value = value;
            this.desc=desc;
        }
        public void setDesc(String desc){
            this.desc=desc;
        
        }
        public void setValue(char value){
            this.value=value;
        }
        
        public String getDesc(){
            return desc;
        }
        public char getValue(){
            return value;
        }
    }
}
