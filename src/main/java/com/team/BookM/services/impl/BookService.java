package com.team.BookM.services.impl;

import com.team.BookM.entity.BookEntity;
import com.team.BookM.repository.BookRepo;
import com.team.BookM.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private BookRepo bookRepo;
    @Override
    public List<BookEntity> findAll() {
        return bookRepo.findAll();
    }

    @Override
    public List<BookEntity> findByBookName(String bookName) {
        return bookRepo.findByBookName(bookName);
    }

    @Override
    public List<BookEntity> findByBookCategory(String bookCategory) {
        return bookRepo.findByBookCategory(bookCategory);
    }
}
