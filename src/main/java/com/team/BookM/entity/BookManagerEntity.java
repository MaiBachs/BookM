package com.team.BookM.entity;

import javax.persistence.*;

@Entity
@Table(name = "Bookmanager")
public class BookManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String bookName;
    @Column
    private Long received;
    @Column
    private Long sold;

    public BookManagerEntity() {
    }

    public BookManagerEntity(Long id, String bookName, Long received, Long sold) {
        this.id = id;
        this.bookName = bookName;
        this.received = received;
        this.sold = sold;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Long getReceived() {
        return received;
    }

    public void setReceived(Long received) {
        this.received = received;
    }

    public Long getSold() {
        return sold;
    }

    public void setSold(Long sold) {
        this.sold = sold;
    }
}
