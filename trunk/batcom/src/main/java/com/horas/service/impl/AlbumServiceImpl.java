/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service.impl;

import com.horas.dao.AlbumDAO;
import com.horas.dto.Album;
import com.horas.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jhon
 */
@Transactional
@Service("albumService")
public class AlbumServiceImpl implements AlbumService{
    @Autowired
    private AlbumDAO albumDAO;
    public void addAlbum(Album album) {
       albumDAO.setAlbum(album);
    }
    
}