package com.team.BookM.api;

import com.team.BookM.entity.BookManagerEntity;
import com.team.BookM.services.IBookManagerService;
import com.team.BookM.services.impl.BookManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BookManagerAPI {
    @Autowired
    private IBookManagerService bookManagerService;
    @GetMapping(value = "/bookmanager")
    List<BookManagerEntity> getBookManager(){
        return bookManagerService.findAll();
    }
}
