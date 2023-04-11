package com.team.BookM.services;

import com.team.BookM.entity.BookManagerEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


public interface IBookManagerService {
    List<BookManagerEntity> findAll();
}
