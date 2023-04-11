package com.team.BookM.services;

import com.team.BookM.entity.CustomerEntity;

import java.util.List;

public interface ICustomerService {
    List<CustomerEntity> findAll();
}
