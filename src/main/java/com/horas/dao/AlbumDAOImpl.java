/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Album;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jhon
 */
@Repository
public class AlbumDAOImpl implements AlbumDAO{
    
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
    public void setAlbum(Album album) {
       getSqlSession().insert("com.horas.mapper.Album.addAlbum", album);
    }

    public boolean insertAllPhoto(List<Album> album) {
       boolean status=false;
       if(getSqlSession().insert("com.horas.mapper.Album.insertAllPhoto", album)>1)
           status=true;
       return status;
    }
    
}
