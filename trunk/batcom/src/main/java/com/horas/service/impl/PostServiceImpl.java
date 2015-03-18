/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service.impl;

import com.horas.dao.PostDAO;
import com.horas.dto.Post;
import com.horas.service.PostService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jhon
 */
@Transactional
@Service ("postService")
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDAO postDAO;
    
    public List<Post> getAllPost() {
     return postDAO.getALL();
    }

    public List<Post> addPost(Post post) {
        post.setId(12);
        postDAO.addPost(post);
        return getAllPost();
    }
    
}
