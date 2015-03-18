/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Person;
import java.util.List;

/**
 *
 * @author jhon
 */
public interface PersonDAO {
    public List<Person> findAll();
    public void insertPerson(Person person);
    
}
