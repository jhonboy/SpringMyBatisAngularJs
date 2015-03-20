/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service.impl;

import com.horas.dao.MomentDAO;
import com.horas.dto.Moment;
import com.horas.service.MomentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jhon
 */
@Transactional
@Service("momentService")
public class MomentServiceImpl implements MomentService{

    @Autowired
    private MomentDAO momentDAO;
    
    public void insertMoment(Moment moment) {
        momentDAO.insertMoment(moment);
    }

    public List<Moment> getMoment() {
       return momentDAO.getMoment();
       
    }
    
}
