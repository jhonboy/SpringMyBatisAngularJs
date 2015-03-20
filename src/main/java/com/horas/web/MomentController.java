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
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 *
 * @author jhon
 */
@Controller
public class MomentController extends RandomUUID{
 
    @Inject
    private MomentService momentService;
   
    
     @RequestMapping(value="/moments",method=RequestMethod.GET)
     @ResponseBody
     public List<Moment> getMoments(){
         return momentService.getMoment();
     }
    
    /**
     *
     * @param moment
     * @return
     */
    @RequestMapping(value="/moments",method=RequestMethod.POST)
    @ResponseBody
    public ResponseMessage addCommentNews(@RequestBody Moment moment, HttpServletRequest req){
        String username;
        HttpSession sess=req.getSession();
        username=(String) sess.getAttribute("username");
       
        moment.setIdMoment(sys_guid());
        moment.setUsername(username);
        moment.setIpCreate("127.0.1.1");
        moment.setCreateDate(new Date());
        momentService.insertMoment(moment);
        return new ResponseMessage(ResponseMessage.Type.success, "commentAdded");
    }
    
   @RequestMapping(value="/upload", headers = "'Content-Type': 'multipart/form-data'", method = RequestMethod.POST) 
   public ResponseMessage documentUploadController(HttpServletRequest request, HttpServletResponse response) {
     MultipartHttpServletRequest mRequest;
        try {
            mRequest = (MultipartHttpServletRequest) request;
            mRequest.getParameterMap();

            Iterator<String> itr = mRequest.getFileNames();
            while (itr.hasNext()) {
                MultipartFile mFile = mRequest.getFile(itr.next());
                String fileName = mFile.getOriginalFilename();
                System.out.println(fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseMessage(ResponseMessage.Type.success,"Berhasil upload");
    }
}
