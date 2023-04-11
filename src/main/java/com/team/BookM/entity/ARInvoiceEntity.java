package com.team.BookM.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "ARInvoice")
public class ARInvoiceEntity {
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
    private Long tob;
    @Column
    private Long  paid;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id", referencedColumnName = "id")
    private CustomerEntity customerEntity;

    public ARInvoiceEntity() {
    }

    public ARInvoiceEntity(Long id, String name, String adress, String phone, Long tob, Long paid, CustomerEntity customerEntity) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.tob = tob;
        this.paid = paid;
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

    public Long getPaid() {
        return paid;
    }

    public void setPaid(Long paid) {
        this.paid = paid;
    }
}
