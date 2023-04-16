package com.team.BookM.api;

import com.team.BookM.api.input.BookInput;
import com.team.BookM.api.output.BookOutput.BookOutput;
import com.team.BookM.entity.BookEntity;
import com.team.BookM.services.IBookService;
import com.team.BookM.services.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BookAPI {
    @Autowired
    private IBookService bookService;
    @GetMapping(value = "/getAllBook")
    public List<BookEntity> getAllBook(){
        return bookService.findAll();
    }

    @PostMapping(value = "/getBookByName")
    public List<BookEntity> getBookByName(@RequestBody BookEntity bookEntity){
        return bookService.findByBookName(bookEntity.getBookName());
    }
    @PostMapping(value = "/getBookByCategory")
    public List<BookEntity> getBookByCategory(@RequestBody BookEntity bookEntity){
        return bookService.findByBookCategory(bookEntity.getBookCategory());
    }
    @PostMapping(value = "/getBookByPage")
    public BookOutput findBookByPage(@RequestBody BookInput bookInput){
        return bookService.findBookByPage(bookInput.getPage()-1, bookInput.getSize());
    }
}
