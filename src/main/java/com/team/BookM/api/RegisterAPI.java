package com.team.BookM.api;

import com.team.BookM.entity.AuthorityEntity;
import com.team.BookM.entity.User;
import com.team.BookM.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RegisterAPI {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @PostMapping(value = "/register-user")
    public void registerUser(@RequestBody User userInput){
        List<AuthorityEntity> authorityList=new ArrayList<>();
		authorityList.add(createAuthority("ROLE_USER","USER role"));

		User user=new User();
		user.setUserName(userInput.getUserName());
        user.setPhoneNumber(userInput.getPhoneNumber());
		user.setPassword(passwordEncoder.encode(userInput.getPassword()));
		user.setEnabled(true);
		user.setAuthorities(authorityList);

        userDetailsRepository.save(user);
    }
    @PostMapping(value = "/register-admin")
    public void registerAdmin(@RequestBody User userInput){
        List<AuthorityEntity> authorityList=new ArrayList<>();
        authorityList.add(createAuthority("ROLE_ADMIN","ADMIN role"));

        User user=new User();
        user.setUserName(userInput.getUserName());
        user.setPhoneNumber(userInput.getPhoneNumber());
        user.setPassword(passwordEncoder.encode(userInput.getPassword()));
        user.setEnabled(true);
        user.setAuthorities(authorityList);

        userDetailsRepository.save(user);
    }
    private AuthorityEntity createAuthority(String roleCode,String roleDescription) {
        AuthorityEntity authority=new AuthorityEntity();
        authority.setRoleCode(roleCode);
        authority.setRoleDescription(roleDescription);
        return authority;
    }
}
