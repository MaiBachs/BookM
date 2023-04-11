package com.team.BookM.services.impl;

import com.team.BookM.entity.ARInvoiceEntity;
import com.team.BookM.repository.ARInvoiceRepo;
import com.team.BookM.services.IARInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ARInvoiceService implements IARInvoiceService {
    @Autowired
    private ARInvoiceRepo arInvoiceRepo;

    @Override
    public ARInvoiceEntity findById(Long id) {
        return arInvoiceRepo.findById(id).orElse(null);
    }

    @Override
    public ARInvoiceEntity save(ARInvoiceEntity arInvoiceEntity) {
        ARInvoiceEntity arInvoiceEntity2 = arInvoiceRepo.findById(arInvoiceEntity.getId()).orElse(null);
        arInvoiceEntity2.setTob(arInvoiceEntity2.getTob() - arInvoiceEntity.getPaid());
        if(arInvoiceEntity2.getTob() == 0l){
            arInvoiceRepo.deleteById(arInvoiceEntity.getId());
            return null;
        }
        arInvoiceEntity2.setPaid(arInvoiceEntity.getPaid());
        return arInvoiceRepo.save(arInvoiceEntity2);
    }

    @Override
    public List<ARInvoiceEntity> findAll() {
        return arInvoiceRepo.findAll();
    }
    public ARInvoiceEntity findByPhone(String phone){
        return arInvoiceRepo.findByPhone(phone);
    }
}
