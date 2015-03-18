/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service;

import com.horas.dto.Post;
import java.util.List;

/**
 *
 * @author jhon
 */
public interface PostService {
    List<Post> getAllPost();


    public List<Post> addPost(Post post);
}
