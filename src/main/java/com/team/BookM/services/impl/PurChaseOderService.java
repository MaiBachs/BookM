package com.team.BookM.services.impl;

import com.team.BookM.entity.BookEntity;
import com.team.BookM.entity.BookManagerEntity;
import com.team.BookM.entity.PurchaseOrderEntity;
import com.team.BookM.repository.BookManagerRepo;
import com.team.BookM.repository.BookRepo;
import com.team.BookM.repository.PurchaseOrderRepo;
import com.team.BookM.services.IPurchaseOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurChaseOderService implements IPurchaseOderService {
    @Autowired
    private PurchaseOrderRepo purchaseOrderRepo;
    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private BookManagerRepo bookManagerRepo;
    @Override
    public PurchaseOrderEntity save(PurchaseOrderEntity purchaseOrderEntity){
        purchaseOrderRepo.save(purchaseOrderEntity);
        BookEntity bookEntity = new BookEntity();
        BookEntity oldBook = null;
        List<BookEntity> list = bookRepo.findByBookName(purchaseOrderEntity.getBookName());
        if(list.size() > 0){
            oldBook = list.get(0);
        }
        if(oldBook == null){
            bookEntity.setBookName(purchaseOrderEntity.getBookName());
            bookEntity.setBookAuthor(purchaseOrderEntity.getBookAuthor());
            bookEntity.setBookCategory(purchaseOrderEntity.getBookCategory());
            bookEntity.setBookDescription(purchaseOrderEntity.getBookDescription());
            bookEntity.setBookInventory(purchaseOrderEntity.getBookQuatity());
            bookEntity.setBookPrice((long) (purchaseOrderEntity.getBookPrice()*1.25));
            bookEntity.setCoverBook(purchaseOrderEntity.getCoverBook());
            bookRepo.save(bookEntity);
        }else{
            bookRepo.UpdateBookInventory(oldBook.getBookInventory()+purchaseOrderEntity.getBookQuatity(),oldBook.getId());
        }
        BookManagerEntity bookManagerEntity = bookManagerRepo.findByBookName(purchaseOrderEntity.getBookName());
        if(bookManagerEntity != null){
            bookManagerEntity.setReceived(bookManagerEntity.getReceived() + purchaseOrderEntity.getBookQuatity());
            bookManagerRepo.save(bookManagerEntity);
        }else{
            bookManagerEntity = new BookManagerEntity();
            bookManagerEntity.setBookName(purchaseOrderEntity.getBookName());
            bookManagerEntity.setReceived(purchaseOrderEntity.getBookQuatity());
            bookManagerRepo.save(bookManagerEntity);
        }
        return purchaseOrderEntity;
    }
}
