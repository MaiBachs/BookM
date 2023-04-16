package com.team.BookM.api.output.BookOutput;

import com.team.BookM.entity.BookEntity;

import java.util.List;

public class BookOutput {
    private int page;
    private int totalPage;
    private List<BookEntity> bookEntityList;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<BookEntity> getBookEntityList() {
        return bookEntityList;
    }

    public void setBookEntityList(List<BookEntity> bookEntityList) {
        this.bookEntityList = bookEntityList;
    }
}
