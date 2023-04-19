package com.team.BookM.repository;

import com.team.BookM.entity.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<BookEntity, Long> {
    List<BookEntity> findByBookName(String bookName);
    Page<BookEntity> findByBookCategory(String bookCategory, Pageable pageable);
    @Modifying
    @Transactional
    @Query("UPDATE BookEntity SET bookInventory = ?1 WHERE id =  ?2")
    void UpdateBookInventory(Long bookInventory,Long id );
}
