package com.team.BookM.repository;

import com.team.BookM.entity.BillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepo extends JpaRepository<BillEntity, Long> {
}
