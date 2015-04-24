/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service.impl;

import com.horas.dao.FamilyDAO;
import com.horas.dto.Family;
import com.horas.service.FamilyService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ardodonk
 */
@Transactional
@Service("familyService")
public class FamilyServiceImpl implements FamilyService {
    
    @Autowired
    private FamilyDAO familyDAO;
   
    
    public List<Family> getFamily() {
        
        
        return familyDAO.getFamily();
    }
    
     
      
}
