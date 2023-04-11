package com.team.BookM.services.impl;

import com.team.BookM.entity.BookManagerEntity;
import com.team.BookM.repository.BookManagerRepo;
import com.team.BookM.services.IBookManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManagerService implements IBookManagerService {
    @Autowired
    private BookManagerRepo bookManagerRepo;
    @Override
    public List<BookManagerEntity> findAll() {
        return bookManagerRepo.findAll();
    }
}
