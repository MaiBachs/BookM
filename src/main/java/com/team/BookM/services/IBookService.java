package com.team.BookM.services;

import com.team.BookM.entity.BookEntity;

import java.util.List;

public interface IBookService {
    List<BookEntity> findAll();
    List<BookEntity> findByBookName(String bookName);
    List<BookEntity> findByBookCategory(String bookCategory);
}
