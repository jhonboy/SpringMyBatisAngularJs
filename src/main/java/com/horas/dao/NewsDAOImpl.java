/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.News;
import java.util.List;
import java.util.UUID;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ardodonk
 */
@Repository("newsDAO")
public class NewsDAOImpl implements NewsDAO{
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
    
    public List<News> getAllNews() {
        return getSqlSession().selectList("com.horas.mapper.news.getAllNews");
    }

    public List<News> getNewsByCat(News news) {
        return getSqlSession().selectList("com.horas.mapper.news.getNewsByCat", news);
    }

    public List<News> getNewsById(UUID id) {
        return getSqlSession().selectList("com.horas.mapper.news.getNewsById", id);
    }
    
}
