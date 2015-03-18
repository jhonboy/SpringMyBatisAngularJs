/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service;

import com.horas.dto.News;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author ardodonk
 */
public interface NewsService {
    public List<News> getAllNews();
    public List<News> getNewsById(UUID id);
}
