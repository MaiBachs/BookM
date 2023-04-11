package com.team.BookM.api;

import com.team.BookM.entity.PageBusinessEntity;
import com.team.BookM.services.IPageBusinessService;
import com.team.BookM.services.impl.PageBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PageBusinessAPI {
    @Autowired
    private IPageBusinessService pageBusinessService;
    @GetMapping(value = "/pagebusiness")
    List<PageBusinessEntity> getHome(){
        return pageBusinessService.findAll();
    }
}
