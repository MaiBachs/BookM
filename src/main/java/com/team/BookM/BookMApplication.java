package com.team.BookM;

import com.team.BookM.entity.AuthorityEntity;
import com.team.BookM.entity.User;
import com.team.BookM.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication()
public class BookMApplication {
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	//exclude = {SecurityAutoConfiguration.class }
	public static void main(String[] args) {
		SpringApplication.run(BookMApplication.class, args);
	}

//	@PostConstruct
//	protected void init() {
//
//		List<AuthorityEntity> authorityList=new ArrayList<>();
//
//		authorityList.add(createAuthority("ROLE_USER","USER role"));
//
//		User user=new User();
//
//		user.setUserName("user");
//		user.setFirstName("user");
//		user.setLastName("user");
//
//		user.setPassword(passwordEncoder.encode("user"));
//		user.setEnabled(true);
//		user.setAuthorities(authorityList);
//
//		userDetailsRepository.save(user);
//	}
	private AuthorityEntity createAuthority(String roleCode,String roleDescription) {
		AuthorityEntity authority=new AuthorityEntity();
		authority.setRoleCode(roleCode);
		authority.setRoleDescription(roleDescription);
		return authority;
	}
}
