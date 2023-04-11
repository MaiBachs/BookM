package com.team.BookM.services.impl;

import com.team.BookM.entity.User;
import com.team.BookM.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserService implements UserDetailsService {
    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub

        User user=userDetailsRepository.findByUserName(username);

        if(null==user) {
            throw new UsernameNotFoundException("User Not Found with userName "+username);
        }
        return user;
    }
}