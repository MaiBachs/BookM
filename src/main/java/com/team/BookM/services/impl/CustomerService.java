package com.team.BookM.services.impl;

import com.team.BookM.entity.CustomerEntity;
import com.team.BookM.repository.CustomerRepo;
import com.team.BookM.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public List<CustomerEntity> findAll() {
        return customerRepo.findAll();
    }
}
