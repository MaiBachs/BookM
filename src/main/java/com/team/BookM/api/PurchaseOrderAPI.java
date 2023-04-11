package com.team.BookM.api;

import com.team.BookM.entity.PurchaseOrderEntity;
import com.team.BookM.services.IPurchaseOderService;
import com.team.BookM.services.impl.PurChaseOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class PurchaseOrderAPI {
    @Autowired
    private IPurchaseOderService purChaseOderService;

    @PostMapping(value = "/purchaseorder")
    public PurchaseOrderEntity postPurchaseOrder(@RequestBody PurchaseOrderEntity purchaseOrderEntity){
        return purChaseOderService.save(purchaseOrderEntity);
    }
}
