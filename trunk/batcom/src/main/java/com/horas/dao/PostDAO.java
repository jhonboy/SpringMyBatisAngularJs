/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.dao;

import com.horas.dto.Post;
import java.util.List;

/**
 *
 * @author jhon
 */
public interface PostDAO {
    public List<Post> getALL();

    public List<Post> addPost(Post post);
    
}
