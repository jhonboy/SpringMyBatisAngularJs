/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

/**
 *
 * @author jhon
 */

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.horas.dto.Person;
import com.horas.dto.ResponseMessage;
import com.horas.dto.Unit;
import com.horas.service.UnitService;


/**
 * Controller for person actions.
 */
@Controller
public class UnitController {
    @Inject
    private UnitService unitService;

    @RequestMapping(value = "/unit", method = RequestMethod.GET)
    @ResponseBody
    public List<Unit> getUnits() {
        return unitService.getAllUnit();
    }

    @RequestMapping(value = "/unit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage addUnit(@RequestBody Unit unit) {
         
        unitService.addUnit(unit);
        return new ResponseMessage(ResponseMessage.Type.success, "UnitAdded");
    }
}
