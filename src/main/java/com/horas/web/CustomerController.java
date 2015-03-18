/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

import com.horas.dto.Customer;
import com.horas.dto.Person;
import com.horas.dto.ResponseMessage;
import com.horas.service.CustomerService;
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
public class CustomerController {
    
    @Inject
    CustomerService customerService;
    
    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage addCustomer(@RequestBody Customer customer) {
        
        customerService.addCustomer(customer);
        return new ResponseMessage(ResponseMessage.Type.success, "customerAdded");
    }
}
