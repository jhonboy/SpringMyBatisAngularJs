/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

import com.horas.dto.Comment;
import com.horas.dto.ResponseMessage;
import com.horas.service.CommentService;
import com.horas.util.RandomUUID;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ardodonk
 */
@Controller
public class CommentController extends RandomUUID {
    @Inject
    private CommentService commentService;
    
    @RequestMapping(value="/comments",method=RequestMethod.GET)
    @ResponseBody
    public List<Comment> getCommentNews(){
        return commentService.getCommentNews();
    }
    
    /**
     *
     * @param comment
     * @return
     */
    @RequestMapping(value="/addcomments",method=RequestMethod.POST)
    @ResponseBody
    public ResponseMessage addCommentNews(@RequestBody Comment comment, HttpServletRequest request){
        String username;
        HttpSession sess=request.getSession();
        username= (String) sess.getAttribute("username");
         comment.setIdComment(sys_guid());
       //  comment.setIdNews(sys_guid());
         comment.setUserComment(username);
         comment.setIpComment("127.0.0.2");
         comment.setDateComment(new Date());
         commentService.addCommentNews(comment);
        return new ResponseMessage(ResponseMessage.Type.success, "commentAdded");
    }
}