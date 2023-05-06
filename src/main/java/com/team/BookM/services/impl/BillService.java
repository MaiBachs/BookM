package com.team.BookM.services.impl;

import com.team.BookM.entity.*;
import com.team.BookM.repository.*;
import com.team.BookM.services.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BillService implements IBillService {
    @Autowired
    private BillRepo billRepo;
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ARInvoiceRepo arInvoiceRepo;
    @Autowired
    private BookListInBillsRepo bookListInBillsRepo;
    @Autowired
    private BookManagerRepo bookManagerRepo;
    @Autowired
    private PageBusinessRepo pageBusinessRepo;
    @Autowired
    private BookRepo bookRepo;
    @Override
    public BillEntity save(BillEntity billEntity){
        if(billEntity.getTob() !=  null ){
            if(arInvoiceRepo.findByPhone(billEntity.getPhone()) != null){
                return null;
            }
        }
        PageBusinessEntity pageBusinessEntity = pageBusinessRepo.findById(1l).orElse(null);
        if(pageBusinessEntity == null){
            pageBusinessEntity = new PageBusinessEntity(0l, 0l, 0l, 0l, 0l);
        }
        if(billEntity.getTob() != null){
            pageBusinessEntity.setTotalDebtCustomer(pageBusinessEntity.getTotalDebtCustomer() + 1l);
        }


        List<BookListInBillsEntity> bookList = new ArrayList<>();
        for(BookListInBillsEntity i: billEntity.getBookListInBillsEntity()){
            BookEntity bookEntity = bookRepo.findByBookName(i.getNameBook()).get(0);
            if(bookEntity.getPurchases() != null){
                bookEntity.setPurchases(bookEntity.getPurchases() + i.getQuatity());
            }else{
                bookEntity.setPurchases(i.getQuatity());
            }
            bookEntity.setBookInventory(bookEntity.getBookInventory() - i.getQuatity());
            bookRepo.save(bookEntity);

            i.setBillEntity(billEntity);
            bookList.add(i);

            if(billEntity.getTob() !=  null){
                pageBusinessEntity.setTotalDebtBook(pageBusinessEntity.getTotalDebtBook() + i.getQuatity());
            }else {
                pageBusinessEntity.setRevenue(pageBusinessEntity.getRevenue() + i.getTotalPrice());
                pageBusinessEntity.setProfit((long) (pageBusinessEntity.getProfit() + i.getTotalPrice() - i.getTotalPrice()*100/125));
            }

            BookManagerEntity bookManagerEntity = bookManagerRepo.findByBookName(i.getNameBook());
            if(bookManagerEntity == null){
                bookManagerEntity = new BookManagerEntity();
                bookManagerEntity.setBookName(i.getNameBook());
                bookManagerEntity.setSold(i.getQuatity());
                bookManagerRepo.save(bookManagerEntity);
            }else {
                Long sold = 0l;
                if(bookManagerEntity.getSold() != null){
                    sold += bookManagerEntity.getSold();
                }
                bookManagerEntity.setSold(sold + i.getQuatity());
                bookManagerRepo.save(bookManagerEntity);
            }
        }

        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setCustomerName(billEntity.getName());
        customerEntity.setCustomerAdress(billEntity.getAdress());
        customerEntity.setCustomerEmail(billEntity.getEmail());
        customerEntity.setCustomerPhone(billEntity.getPhone());
        billEntity.setCustomerEntity(customerEntity);
        billEntity.setBookListInBillsEntity(null);
        billRepo.save(billEntity);

        pageBusinessEntity.setCustomerNumber((long) customerRepo.findAll().size());
        pageBusinessRepo.save(pageBusinessEntity);

        if(billEntity.getTob() != null){
            ARInvoiceEntity arInvoiceEntity = new ARInvoiceEntity();
            arInvoiceEntity.setName(billEntity.getName());
            arInvoiceEntity.setAdress(billEntity.getAdress());
            arInvoiceEntity.setPhone(billEntity.getPhone());
            arInvoiceEntity.setTob(billEntity.getTob());
            arInvoiceEntity.setCustomerEntity(customerEntity);
            arInvoiceRepo.save(arInvoiceEntity);
        }

        bookListInBillsRepo.saveAll(bookList);
        return billRepo.save(billEntity);
    }
}
