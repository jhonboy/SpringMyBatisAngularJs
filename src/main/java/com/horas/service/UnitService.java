/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service;

import com.horas.dto.Unit;
import java.util.List;

/**
 *
 * @author jhon
 */
public interface UnitService {
    public List<Unit> getAllUnit();
    public List<Unit> getUnitById(String id);
    public void addUnit(Unit unit);
    public void deleteUnit(String id);
    public List<Unit> searchUnit(String name);
    
}
