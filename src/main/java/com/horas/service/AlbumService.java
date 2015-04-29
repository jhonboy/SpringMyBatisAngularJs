/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service;

import com.horas.dto.Album;
import com.horas.dto.Moment;
import java.util.List;

/**
 *
 * @author jhon
 */
public interface AlbumService {
    public void addAlbum(Album album);
    public boolean insertAllPhoto(List<Album> album);
    public List<Album> getAllPhotoByMoment(Moment moment);
}
