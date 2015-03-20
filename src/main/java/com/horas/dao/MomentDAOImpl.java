/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Moment;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jhon
 */
@Repository("momentDAO")
public class MomentDAOImpl implements MomentDAO{
    
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
    
    public void insertMoment(Moment moment) {
        getSqlSession().insert("com.horas.mapper.moment.insertMoment", moment);
        
    }
    
}
