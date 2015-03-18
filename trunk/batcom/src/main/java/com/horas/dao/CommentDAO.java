/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Comment;
import java.util.List;


/**
 *
 * @author ardodonk
 */
public interface CommentDAO {
    public List<Comment> commentNews();
    public void addCommentNews(Comment comment);
}
