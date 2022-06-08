package com.r2s.findInternship.Service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.r2s.findInternship.DTO.UserCreationDTO;
import com.r2s.findInternship.DTO.UserDTO;
import com.r2s.findInternship.Entity.User;

public interface UserService extends UserDetailsService {

	boolean existsById(String id);
	List<UserDTO> findAll();
	UserDTO save(UserCreationDTO entity);
	User findByUsername(String username);
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
