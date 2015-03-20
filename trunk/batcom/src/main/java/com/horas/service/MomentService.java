/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service;

import com.horas.dto.Moment;
import java.util.List;

/**
 *
 * @author jhon
 */
public interface MomentService {
    public void insertMoment(Moment moment);
    public List<Moment> getMoment();
}
