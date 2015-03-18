/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.News;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author ardodonk
 */

public interface NewsDAO {
    public List<News> getAllNews();
    public List<News> getNewsByCat(News news);
    public List<News> getNewsById(UUID id);
}
