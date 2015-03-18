/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

import com.horas.dto.Post;
import com.horas.dto.ResponseMessage;
import com.horas.service.PostService;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author jhon
 */
@Controller
public class PostController {
    @Inject 
    private PostService postService;
    
    @RequestMapping(value = "/post", method = RequestMethod.GET)
    @ResponseBody
    public List<Post> getPosts() {
        return postService.getAllPost();
    }
    
    @RequestMapping(value="/post",method=RequestMethod.POST)
    @ResponseBody
    public ResponseMessage addPost(@RequestBody Post post){
        postService.addPost(post);
        return new ResponseMessage(ResponseMessage.Type.success, "postAdded");   
    }
            
}
