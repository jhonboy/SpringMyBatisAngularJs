/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

/**
 *
 * @author jhon
 */


import com.horas.dto.Person;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 

@Repository("personDAO")
public class PersonDAOImpl implements PersonDAO{

	@Autowired
	private SqlSession sqlSession;
	
	public List<Person> findAll() {
		List<Person> persons = getSqlSession().selectList("com.horas.mapper.Person.findAll");
		return persons;
	}

	 
	 public void insertPerson(Person person) {
                getSqlSession().insert("com.horas.mapper.Person.insertPerson", person);
                
             }

	/**
	 * @return the sqlSession
	 */
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	/**
	 * @param sqlSession the sqlSession to set
	 */
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

   

}
