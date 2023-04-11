package com.team.BookM.services.impl;

import com.team.BookM.entity.PageBusinessEntity;
import com.team.BookM.repository.PageBusinessRepo;
import com.team.BookM.services.IPageBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageBusinessService implements IPageBusinessService {
    @Autowired
    private PageBusinessRepo pageBusinessRepo;
    @Override
    public List<PageBusinessEntity> findAll() {
        return pageBusinessRepo.findAll();
    }
}
