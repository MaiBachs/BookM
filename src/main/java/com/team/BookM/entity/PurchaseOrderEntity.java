package com.team.BookM.entity;

import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Purchaseorder")
public class PurchaseOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String bookName;
    @Column
    private String bookAuthor;
    @Column
    private String bookCategory;
    @Column(columnDefinition = "LONGTEXT")
    private String bookDescription;
    @Column
    private Long bookQuatity;
    @Column
    private Long bookPrice;
    @Column
    private Long payments;
    @Column
        private Date receivedDate;
    @Column
    private String coverBook;
    @ManyToMany(mappedBy = "purchaseOrderEntityList")
    private List<BookEntity> bookEntityList;

    public PurchaseOrderEntity() {
    }

    public PurchaseOrderEntity(long id, String bookName, String bookAuthor, String bookCategory, String bookDescription, Long bookQuatity, Long bookPrice, Long payments, Date receivedDate, String coverBook, List<BookEntity> bookEntityList) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookDescription = bookDescription;
        this.bookQuatity = bookQuatity;
        this.bookPrice = bookPrice;
        this.payments = payments;
        this.receivedDate = receivedDate;
        this.coverBook = coverBook;
        this.bookEntityList = bookEntityList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Long getBookQuatity() {
        return bookQuatity;
    }

    public void setBookQuatity(Long bookQuatity) {
        this.bookQuatity = bookQuatity;
    }

    public Long getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Long bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Long getPayments() {
        return payments;
    }

    public void setPayments(Long payments) {
        this.payments = payments;
    }

    public List<BookEntity> getBookEntityList() {
        return bookEntityList;
    }

    public void setBookEntityList(List<BookEntity> bookEntityList) {
        this.bookEntityList = bookEntityList;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getCoverBook() {
        return coverBook;
    }

    public void setCoverBook(String coverBook) {
        this.coverBook = coverBook;
    }
}
