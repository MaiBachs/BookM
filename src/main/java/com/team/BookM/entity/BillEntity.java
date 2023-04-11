package com.team.BookM.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Bill")
public class BillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String adress;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private Long tob;
    @Column
    private Long payments;
    @OneToMany(mappedBy = "billEntity", cascade = CascadeType.ALL)
    List<BookListInBillsEntity> bookListInBillsEntity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private CustomerEntity customerEntity;

    public BillEntity() {
    }

    public BillEntity(Long id, String name, String adress, String phone, String email, Long tob, Long payments, List<BookListInBillsEntity> bookListInBillsEntity, CustomerEntity customerEntity) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.tob = tob;
        this.payments = payments;
        this.bookListInBillsEntity = bookListInBillsEntity;
        this.customerEntity = customerEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTob() {
        return tob;
    }

    public void setTob(Long tob) {
        this.tob = tob;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    public Long getPayments() {
        return payments;
    }

    public void setPayments(Long payments) {
        this.payments = payments;
    }

    public List<BookListInBillsEntity> getBookListInBillsEntity() {
        return bookListInBillsEntity;
    }

    public void setBookListInBillsEntity(List<BookListInBillsEntity> bookListInBillsEntity) {
        this.bookListInBillsEntity = bookListInBillsEntity;
    }
}
