package com.team.BookM.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String bookName;
    @Column
    private String bookAuthor;
    @Column
    private String bookCategory;
    @Column(columnDefinition = "LONGTEXT")
    private String bookDescription;
    @Column
    private Long bookPrice;
    @Column
    private Long bookInventory;
    @Column
    private String coverBook;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_purchaseoder")
    private List<PurchaseOrderEntity> purchaseOrderEntityList;

    public BookEntity() {
    }

    public BookEntity(Long id, String bookName, String bookAuthor, String bookCategory, String bookDescription, Long bookPrice, Long bookInventory, String coverBook, List<PurchaseOrderEntity> purchaseOrderEntityList) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookDescription = bookDescription;
        this.bookPrice = bookPrice;
        this.bookInventory = bookInventory;
        this.coverBook = coverBook;
        this.purchaseOrderEntityList = purchaseOrderEntityList;
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

    public Long getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Long bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Long getBookInventory() {
        return bookInventory;
    }

    public void setBookInventory(Long bookInventory) {
        this.bookInventory = bookInventory;
    }

    public List<PurchaseOrderEntity> getPurchaseOrderEntityList() {
        return purchaseOrderEntityList;
    }

    public void setPurchaseOrderEntityList(List<PurchaseOrderEntity> purchaseOrderEntityList) {
        this.purchaseOrderEntityList = purchaseOrderEntityList;
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
