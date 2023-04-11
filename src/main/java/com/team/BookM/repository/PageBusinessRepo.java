package com.team.BookM.repository;

import com.team.BookM.entity.PageBusinessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface PageBusinessRepo extends JpaRepository<PageBusinessEntity, Long> {
}
