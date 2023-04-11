package com.team.BookM.entity;

import javax.persistence.*;

@Entity
public class PageBusinessEntity {
    @Id
    private Long id = 1l;
    @Column
    private Long revenue;
    @Column
    private Long profit;
    @Column
    private Long customerNumber;
    @Column
    private Long totalDebtBook;
    @Column
    private Long totalDebtCustomer;

    public PageBusinessEntity() {
    }

    public PageBusinessEntity(Long revenue, Long profit, Long customerNumber, Long totalDebtBook, Long totalDebtCustomer) {
        this.revenue = revenue;
        this.profit = profit;
        this.customerNumber = customerNumber;
        this.totalDebtBook = totalDebtBook;
        this.totalDebtCustomer = totalDebtCustomer;
    }
    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    public Long getProfit() {
        return profit;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
    }

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Long getTotalDebtBook() {
        return totalDebtBook;
    }

    public void setTotalDebtBook(Long totalDebtBook) {
        this.totalDebtBook = totalDebtBook;
    }

    public Long getTotalDebtCustomer() {
        return totalDebtCustomer;
    }

    public void setTotalDebtCustomer(Long totalDebtCustomer) {
        this.totalDebtCustomer = totalDebtCustomer;
    }
}
