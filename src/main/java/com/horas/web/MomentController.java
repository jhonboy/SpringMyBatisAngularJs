/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

import com.horas.dto.Album;
import com.horas.dto.Moment;
import com.horas.dto.ResponseMessage;
import com.horas.service.AlbumService;
import com.horas.service.MomentService;
import com.horas.util.ApplicationContextUtils;
import com.horas.util.RandomUUID;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
public class MomentController extends ApplicationContextUtils{
 
    @Inject
    private MomentService momentService;
    @Inject 
    private AlbumService albumService;
    
    private String fileName;
    private UUID id;
    
    BufferedImage bufferedImage;
    
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
        moment.setIdMoment(sys_guid());
        moment.setUsername(getUsername());
        moment.setIpCreate("127.0.1.1");
        moment.setCreateDate(new Date());
        moment.setPhoto(fileName);
        momentService.insertMoment(moment);
        
        return new ResponseMessage(ResponseMessage.Type.success, "commentAdded");
        
    }
    

    
    @RequestMapping(value="/upload", method = RequestMethod.POST)
    public void UploadFile(MultipartHttpServletRequest request,HttpServletResponse response) throws IOException {
        try{
            Album album= new Album();
            Moment moment= new Moment();
            String extension;
            String newPhoto;
            Iterator<String> itr=request.getFileNames();
            MultipartFile file=request.getFile(itr.next());
            fileName=file.getOriginalFilename();
            File serverFile = null;
            id=sys_guid();
            extension=fileName.substring(fileName.length()-3, fileName.length()); 
            
            album.setId(sys_guid());
            album.setIdMoment(id);
            album.setPhoto(fileName);
            album.setExtension(extension);
            newPhoto=album.getId().toString()+"."+extension;
            albumService.addAlbum(album);  
            moment.setIdMoment(id);
            moment.setUsername(getUsername());
            moment.setPhoto(album.getId().toString());
            moment.setIpCreate("ipCreate");
            moment.setCreateDate(new Date());
            momentService.insertMoment(moment);
            
            
           // File dir= new File("D:/jhon/windows/apache-tomcat-7.0.57/webapps/images/");
             File dir = new File("/Users/jhon/server/apache-tomcat-7.0.57/webapps/images/");
     
             if (dir.isDirectory())
             {
                serverFile = new File(dir,fileName);
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(file.getBytes()); 
                File serverFileNew=new File(dir,newPhoto);
                FileUtils.copyFile(serverFile ,  serverFileNew);  
              
             }else {
                System.out.println("not");
             }
              serverFile.delete();
        }catch(Throwable th){
            th.printStackTrace();
        }
    }
    
    
    
}
