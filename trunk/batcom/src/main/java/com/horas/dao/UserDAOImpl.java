/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.User;
import com.horas.dto.UserDetail;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.log4j.Logger;

/**
 *
 * @author ardodonk
 */
@Repository ("userDAO")
public class UserDAOImpl implements UserDAO {
    private Logger logger = Logger.getLogger(UserDAO.class);
    
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


    public UserDetail getUserDetails(String username) {
        return getSqlSession().selectOne("com.horas.mapper.user.getUserDetail", username);
    }

    public void signUp(User user) {
        logger.debug("==== BEGIN ====");
        
        getSqlSession().insert("com.horas.mapper.user.signup", user);
        getSqlSession().insert("com.horas.mapper.user.insertRole", user.getRole());
        getSqlSession().insert("com.horas.mapper.user.insertUserDetails",user.getUserDetail());
        //getSqlSession().commit();
        logger.debug("=== END =====");
              
    }
}
