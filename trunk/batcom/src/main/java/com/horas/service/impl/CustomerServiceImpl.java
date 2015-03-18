/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.service.impl;

import com.horas.dao.CustomerDAO;
import com.horas.dto.Customer;
import com.horas.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jhon
 */
@Transactional
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerDAO customerDAO;
    
    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }
    
}
