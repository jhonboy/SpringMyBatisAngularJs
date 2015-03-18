/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

import com.horas.dto.News;
import com.horas.service.NewsService;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ardodonk
 */
@Controller
public class NewsController {
    @Inject
    private NewsService newsService;
    
    @RequestMapping(value = "/news", method = RequestMethod.GET)
    @ResponseBody
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }
    
//    @RequestMapping(value = "/news/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public List<News> getNewsById(@PathVariable UUID id) {
//        return newsService.getNewsById(id);
//    }
}
