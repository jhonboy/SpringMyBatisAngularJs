package com.horas.service;

import java.util.List;

import com.horas.dto.Person;

/**
 * Service to handle Persons.
 */
public interface PersonService {
    List<Person> getAllPersons();

    void addPerson(Person person);

    void deletePerson(int id);
}
