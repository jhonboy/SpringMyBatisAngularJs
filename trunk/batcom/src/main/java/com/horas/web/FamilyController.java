/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

import com.horas.constant.GlobalSession;
import com.horas.dto.Family;
import com.horas.dto.User;
import com.horas.dto.UserDetail;
import com.horas.service.FamilyService;
import com.horas.service.UserService;
import com.horas.util.ApplicationContextUtils;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ardodonk
 */
@Controller
public class FamilyController extends ApplicationContextUtils{
    
    @Inject
    private FamilyService familyService;
    @Inject
    private UserService userService;

    @RequestMapping(value = "/family", method = RequestMethod.GET)
    @ResponseBody
    public List<Family> getFamily() {
        List<Family> lstFm= familyService.getFamily();
        UserDetail userDetail=(UserDetail)getApplicationContext().getBean("userDetail");
        userDetail=userService.getUserDetail(getUsername());
        
        Family fm= new Family();
        fm.setName(userDetail.getUsername());
        fm.setParent_id(null);
        fm.setId(userDetail.getUsername());
        
        familyService.addFamily(fm);
        
        lstFm=familyService.getFamily();
        
        return lstFm;
    }
}
