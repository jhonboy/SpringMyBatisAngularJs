/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

import com.horas.dto.Moment;
import com.horas.dto.ResponseMessage;
import com.horas.service.MomentService;
import com.horas.util.RandomUUID;
import java.util.Date;
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
public class MomentController extends RandomUUID{
 
    @Inject
    private MomentService momentService;
    
//    @RequestMapping(value="/moments",method=RequestMethod.GET)
//    @ResponseBody
//    public List<Moment> getMoments(){
//        return commentService.getCommentNews();
//    }
    
    /**
     *
     * @param moment
     * @return
     */
    @RequestMapping(value="/user/addMoment",method=RequestMethod.POST)
    @ResponseBody
    public ResponseMessage addCommentNews(@RequestBody Moment moment){
        moment.setIdMoment(sys_guid());
        moment.setIpCreate("127.0.1.1");
        moment.setCreateDate(new Date());
        momentService.insertMoment(moment);
        return new ResponseMessage(ResponseMessage.Type.success, "commentAdded");
    }
}
