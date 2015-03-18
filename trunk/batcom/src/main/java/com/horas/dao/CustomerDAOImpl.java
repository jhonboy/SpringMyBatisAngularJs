/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Customer;
import com.horas.dto.Post;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jhon
 */
@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {
    
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
    public void addCustomer(Customer customer) {
        sqlSession.insert("com.horas.mapper.Customer.addCustomer", customer);
    }
    
}
