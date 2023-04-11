package com.team.BookM.repository;

import com.team.BookM.entity.BookManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BookManagerRepo extends JpaRepository<BookManagerEntity, Long> {
    BookManagerEntity findByBookName(String bookName);
}
