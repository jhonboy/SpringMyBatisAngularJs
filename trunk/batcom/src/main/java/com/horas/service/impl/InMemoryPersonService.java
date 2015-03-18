package com.horas.service.impl;

import com.horas.dao.PersonDAO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.horas.dto.Person;
import com.horas.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Simple Map based PersonService.
 */
@Transactional
@Service ("personService")
public class InMemoryPersonService implements PersonService {
    
    @Autowired
    private PersonDAO personDAO;
      
    
    List persons;
//
//    public InMemoryPersonService() {
//        persons.put(1, new Person(1, "Lionel", "Messi"));
//        persons.put(2, new Person(2, "Cristiano", "Ronaldo"));
//    }
//
//    public List<Person> getAllPersons() {
//        return new ArrayList<Person>(persons.values());
//    }
//
//    public void addPerson(Person person) {
//        int id = 1;
//        while (persons.get(id) != null) {
//            id++;
//        }
//        person.setId(id);
//        persons.put(id, person);
//    }
//
//    public void deletePerson(int id) {
//        persons.remove(id);
//    }
    
    public List<Person> getAllPersons() {
        persons= new ArrayList<Person> (personDAO.findAll());
        return persons;
    }

    public void addPerson(Person person) {
      person.setId(13);
      personDAO.insertPerson(person);
         
    }

    public void deletePerson(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
