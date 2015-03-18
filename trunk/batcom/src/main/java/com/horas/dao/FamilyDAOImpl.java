/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Family;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ardodonk
 */
@Repository("familyDAO")
public class FamilyDAOImpl implements FamilyDAO{

        @Autowired
    private SqlSession sqlSession;
    
    
    
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
    public List<Family> getFamily() {
       return getSqlSession().selectList("com.horas.mapper.family.getFamily");
    }
    
}
