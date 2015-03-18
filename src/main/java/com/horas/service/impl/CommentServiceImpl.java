/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service.impl;

import com.horas.dao.CommentDAO;
import com.horas.dto.Comment;
import com.horas.service.CommentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ardodonk
 */
@Transactional
@Service("commentService")
public class CommentServiceImpl  implements CommentService{
    @Autowired
    private CommentDAO commentDAO;

    public List<Comment> getCommentNews() {
        return commentDAO.commentNews();
    }

    public void addCommentNews(Comment comment) {
        commentDAO.addCommentNews(comment);
    }
    
}
