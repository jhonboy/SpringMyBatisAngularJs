/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

import com.horas.dto.Family;
import com.horas.service.FamilyService;
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
public class FamilyController {
    
    @Inject
    private FamilyService familyService;

    @RequestMapping(value = "/family", method = RequestMethod.GET)
    @ResponseBody
    public List<Family> getFamily() {
        return familyService.getFamily();
    }
}
