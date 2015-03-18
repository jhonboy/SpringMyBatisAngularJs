/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service.impl;

import com.horas.dao.UnitDAO;
import com.horas.dto.Unit;
import com.horas.service.UnitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jhon
 */
@Transactional
@Service("unitService")
public class UnitServiceImpl implements UnitService {
    
    @Autowired
    private UnitDAO unitDAO;

    public List<Unit> getAllUnit() {
        return unitDAO.getAllUnit();
    }

    public List<Unit> getUnitById(String id) {
        return unitDAO.getUnitById(id);
    }

    public void addUnit(Unit unit) {
        unitDAO.addUnit(unit);
    }

    public void deleteUnit(String id) {
        unitDAO.deleteUnit(id);
    }

    public List<Unit> searchUnit(String name) {
        return unitDAO.searchUnit(name);
    }
    
}
