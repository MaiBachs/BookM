package com.team.BookM.repository;

import com.team.BookM.entity.PurchaseOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepo extends JpaRepository<PurchaseOrderEntity, Long> {
}
