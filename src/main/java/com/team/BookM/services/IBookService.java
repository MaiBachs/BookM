package com.team.BookM.services;

import com.team.BookM.api.output.BookOutput.BookOutput;
import com.team.BookM.entity.BookEntity;

import java.util.List;

public interface IBookService {
    List<BookEntity> findAll();
    List<BookEntity> findByBookName(String bookName);
    BookOutput findByBookCategory(int page, int size,String bookCategory);
    BookOutput findBookByPage(int page, int size);
}
