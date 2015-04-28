/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Album;
import com.horas.dto.Moment;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author jhon
 */
public interface MomentDAO {
    public List<Moment> getMoment();
    public void insertMoment(Moment moment);
    public Moment getMomentByAlbum(Album album);
}
