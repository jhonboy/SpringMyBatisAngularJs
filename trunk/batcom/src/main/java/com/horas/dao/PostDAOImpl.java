/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Post;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jhon
 */

@Repository("postDAO")
public class PostDAOImpl implements PostDAO{
        
    @Autowired
    private SqlSession sqlSession;
    
    public List<Post> getALL() {
       List<Post> posts = getSqlSession().selectList("com.horas.mapper.Post.getPost");
       return posts;
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

    public List<Post> addPost(Post post) {
            getSqlSession().insert("com.horas.mapper.Post.addPost",post);
          return getALL();
    }

}
