package com.team.BookM.repository;

import com.team.BookM.entity.BookListInBillsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookListInBillsRepo extends JpaRepository<BookListInBillsEntity, Long> {
}
