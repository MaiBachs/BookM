package com.team.BookM.services;

import com.team.BookM.entity.ARInvoiceEntity;

import java.util.List;

public interface IARInvoiceService {
    ARInvoiceEntity findById(Long id);
    ARInvoiceEntity save(ARInvoiceEntity arInvoiceEntity);
    List<ARInvoiceEntity> findAll();

    ARInvoiceEntity findByPhone(String phone);
}
