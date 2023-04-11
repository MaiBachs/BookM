package com.team.BookM.api;

import com.team.BookM.entity.ARInvoiceEntity;
import com.team.BookM.services.IARInvoiceService;
import com.team.BookM.services.impl.ARInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ARInvoiceAPI {
    @Autowired
    private IARInvoiceService arInvoiceService;
    @PostMapping(value = "/arinvoice")
    public ARInvoiceEntity paid(@RequestBody ARInvoiceEntity arInvoiceEntity1){
        return arInvoiceService.save(arInvoiceEntity1);
    }
    @PostMapping(value = "/findArinvoice")
    public ARInvoiceEntity findByPhone(@RequestBody ARInvoiceEntity arInvoiceEntity1){
        return arInvoiceService.findByPhone(arInvoiceEntity1.getPhone());
    }
    @GetMapping(value = "/findAllTob")
    public String testApp(@RequestBody ARInvoiceEntity arInvoiceEntity1) {
        return "Hello Spring Security!";
    }

    @GetMapping(value = "/findAll")
    public List<ARInvoiceEntity> findAll(){
        return arInvoiceService.findAll();
    }
}
