/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service.impl;

import com.horas.dao.NewsDAO;
import com.horas.dto.News;
import com.horas.service.NewsService;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ardodonk
 */
@Transactional
@Service ("newsService")
public class NewsServiceImpl implements NewsService{
    
    @Autowired
    private NewsDAO newsDAO;
    public List<News> getAllNews() {
        return newsDAO.getAllNews();
    }

    public List<News> getNewsById(UUID id) {
       return newsDAO.getNewsById(id);
    }
    
}
