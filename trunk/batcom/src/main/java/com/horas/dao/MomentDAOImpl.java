/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Album;
import com.horas.dto.Moment;
import java.util.List;
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

    public List<Moment> getMoment() {
        return getSqlSession().selectList("com.horas.mapper.moment.getMoment");
        
    }

    public Moment getMomentByAlbum(Album album) {
       return getSqlSession().selectOne("com.horas.mapper.moment.getMomentByAlbum", album.getId());
    }
    
}
