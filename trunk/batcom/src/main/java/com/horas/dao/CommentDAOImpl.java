/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Comment;
import java.util.List;
import java.util.UUID;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ardodonk
 */
@Repository("commentDAO")
public class CommentDAOImpl implements CommentDAO {

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
    public List<Comment> commentNews() {
        return getSqlSession().selectList("com.horas.mapper.comment.getCommentNews");
    }

    public void addCommentNews(Comment comment) {
       sqlSession.insert("com.horas.mapper.comment.addCommentNews", comment);
    }
    
}
