package com.team.BookM.api;

import com.team.BookM.entity.BillEntity;
import com.team.BookM.repository.BillRepo;
import com.team.BookM.services.IBillService;
import com.team.BookM.services.impl.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BillAPI {
    @Autowired
    private IBillService billService;
    @Autowired
    BillRepo billRepo;
    @PostMapping(value = "/bill")
    public BillEntity postBill(@RequestBody BillEntity billEntity){
        return billService.save(billEntity);
    }
    @DeleteMapping(value = "/bill")
    public void deletebill(){
        List<Long> id = new ArrayList<>();
        id.add(1l);
        billRepo.deleteAllById(id);
    }
}
