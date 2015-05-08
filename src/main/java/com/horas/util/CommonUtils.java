/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jhon
 */
public class CommonUtils {
    
    public  static String dateFormat(Date date, String DATE_FORMAT) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(date);
    }
}
