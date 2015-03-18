/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Unit;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jhon
 */
@Repository ("unitDAO")
public class UnitDAOImpl implements UnitDAO{
    
    @Autowired
    private SqlSession sqlSession;
 
            

    public List<Unit> getAllUnit() {
        return getSqlSession().selectList("com.horas.mapper.findAll");
    }

    public List<Unit> getUnitById(String id) {
        return getSqlSession().selectOne("com.horas.mapper.getUnitById"+id);
    }

    public void addUnit(Unit unit) {
        getSqlSession().insert("com.horas.mapper.addUnit", unit);
    }

    public void deleteUnit(String id) {
        getSqlSession().delete("com.horas.mapper.deleteUnit", id);
    }

    public List<Unit> searchUnit(String name) {
       return getSqlSession().selectList("com.horas.mapper.searchUnit",name);
    }
    
    public void setSqlSession(SqlSession sqlSession){
        this.sqlSession=sqlSession;
    }
    public SqlSession getSqlSession(){
        return sqlSession;
    }
    
}
