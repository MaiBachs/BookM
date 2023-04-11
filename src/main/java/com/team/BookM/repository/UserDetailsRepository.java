package com.team.BookM.repository;

import com.team.BookM.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
