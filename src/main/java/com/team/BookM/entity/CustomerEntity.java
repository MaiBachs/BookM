package com.team.BookM.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String customerName;
    @Column
    private String customerAdress;
    @Column
    private String customerPhone;
    @Column
    private String  customerEmail;
    @JsonIgnore
    @OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL)
    private List<BillEntity> billEntityList;

    @OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL)
    private List<ARInvoiceEntity> arInvoiceEntityList;

    public CustomerEntity() {
    }

    public CustomerEntity(Long id, String customerName, String customerAdress, String customerPhone, String customerEmail, List<BillEntity> billEntityList, List<ARInvoiceEntity> arInvoiceEntityList) {
        this.id = id;
        this.customerName = customerName;
        this.customerAdress = customerAdress;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.billEntityList = billEntityList;
        this.arInvoiceEntityList = arInvoiceEntityList;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<BillEntity> getBillEntityList() {
        return billEntityList;
    }

    public void setBillEntityList(List<BillEntity> billEntityList) {
        this.billEntityList = billEntityList;
    }

    public List<ARInvoiceEntity> getArInvoiceEntityList() {
        return arInvoiceEntityList;
    }

    public void setArInvoiceEntityList(List<ARInvoiceEntity> arInvoiceEntityList) {
        this.arInvoiceEntityList = arInvoiceEntityList;
    }
}
