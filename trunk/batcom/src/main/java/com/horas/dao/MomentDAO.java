/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Moment;
import java.util.List;

/**
 *
 * @author jhon
 */
public interface MomentDAO {
    public List<Moment> getMoment();
    public void insertMoment(Moment moment);
}
