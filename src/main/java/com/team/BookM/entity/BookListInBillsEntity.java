package com.team.BookM.entity;

import javax.persistence.*;

@Entity
@Table(name = "booklistinbills")
public class BookListInBillsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nameBook;
    @Column
    private Long quatity;
    @Column
    private Long TotalPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bill_id", referencedColumnName = "id")
    private BillEntity billEntity;

    public BookListInBillsEntity() {
    }

    public BookListInBillsEntity(Long id, String nameBook, Long quatity, Long totalPrice, BillEntity billEntity) {
        this.id = id;
        this.nameBook = nameBook;
        this.quatity = quatity;
        TotalPrice = totalPrice;
        this.billEntity = billEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Long getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        TotalPrice = totalPrice;
    }

    public BillEntity getBillEntity() {
        return billEntity;
    }

    public void setBillEntity(BillEntity billEntity) {
        this.billEntity = billEntity;
    }

    public Long getQuatity() {
        return quatity;
    }

    public void setQuatity(Long quatity) {
        this.quatity = quatity;
    }
}
