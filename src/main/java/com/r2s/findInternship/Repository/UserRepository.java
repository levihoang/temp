package com.r2s.findInternship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.r2s.findInternship.DTO.UserDTO;
import com.r2s.findInternship.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, String>{
	User findByUsername(String username);
	boolean existsByEmail(String email);
}
