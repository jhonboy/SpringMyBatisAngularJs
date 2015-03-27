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
    public enum GENERAL {
            /**
             *
             */
            MALE("M","Pria"), FEMALE("F","Perempuan"), MARRIED("M","Menikah"),SINGLE("S","Single"),ROLE_USER("ROLE_USER","Role User"),ROLE_ADMIN("ROLE_ADMIN","Role Admin");

            private String value;
            private String desc;

        private GENERAL(String value,String desc) {
            this.value = value;
            this.desc=desc;
        }
        public void setDesc(String desc){
            this.desc=desc;
        
        }
        public void setValue(String value){
            this.value=value;
        }
        
        public String getDesc(){
            return desc;
        }
        public String getValue(){
            return value;
        }
    }
}
