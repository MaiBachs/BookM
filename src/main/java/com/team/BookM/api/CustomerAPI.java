package com.team.BookM.api;

import com.team.BookM.entity.CustomerEntity;
import com.team.BookM.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CustomerAPI {
    @Autowired
    private ICustomerService customerService;

    @GetMapping(value = "/getAllCustomer")
    public List<CustomerEntity> findAllCustomer(){
        return customerService.findAll();
    }
}
