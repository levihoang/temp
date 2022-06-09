package com.r2s.findInternship.Service.Impl;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.hibernate.ResourceClosedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.r2s.findInternship.DTO.CandidateDTO;
import com.r2s.findInternship.DTO.UserCreationDTO;
import com.r2s.findInternship.DTO.UserDTO;
import com.r2s.findInternship.Entity.Candidate;
import com.r2s.findInternship.Entity.Role;
import com.r2s.findInternship.Entity.User;
import com.r2s.findInternship.Exception.InternalServerErrorException;
import com.r2s.findInternship.Exception.ResourceNotFound;
import com.r2s.findInternship.MapStructMapper.MapperCandidate;
import com.r2s.findInternship.MapStructMapper.MapperUser;
import com.r2s.findInternship.Repository.UserRepository;
import com.r2s.findInternship.Service.RoleService;
import com.r2s.findInternship.Service.UserService;
import com.r2s.findInternship.Util.Validation;
@Service("userDetailsService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder; 
	@Autowired
	private MapperUser mapperUser;
	@Autowired
	private RoleService roleService;
	@Autowired
	private Validation validation;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = findByUsername(username);
		if(user == null)
		{
			 throw new UsernameNotFoundException("Username không tồn tại!");
		}
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(user.getRole().getName()));
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),authorities);
	}
	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	@Override
	public UserCreationDTO handlerValid(UserCreationDTO entity) {
		if(!entity.getPassword().equals(entity.getConfirmPassword()))
		{
			throw new InternalServerErrorException("Mật khẩu không khớp!");
		}
		if(!this.validation.passwordValid(entity.getPassword())) throw new InternalServerErrorException("Mật khẩu phải chứa ký tự HOA, thường và số!");//Valid password
		if(existsByEmail(entity.getEmail())) throw new InternalServerErrorException("Email đã tồn tại, vui lòng nhập email khác!");//CHECK EMAIL
		if(existsById(entity.getUsername())) throw new InternalServerErrorException("Username đã tồn tại, vui lòng nhập username khác");//CHECK USERNAME
		return entity;
	}
	@Override
	public List<UserDTO> findAll() {
		return userRepository.findAll().stream().map(item -> this.mapperUser.mapUser(item)).collect(Collectors.toList());
	}
	@Override
	public boolean existsById(String id) {
		return userRepository.existsById(id);
	}
	public boolean existsByEmail(String email) {
		return userRepository.existsByEmail(email);
	}
	@Override
	public UserDTO update(UserCreationDTO user) {
			User entity = this.mapperUser.mapUser(handlerValid(user));
//			entity.setUsername(u.getUsername());
//			entity.setPassword(u.getPassword());
			String pass = entity.getPassword();	
			entity.setPassword(this.passwordEncoder.encode(pass));
			entity.setCreateDate(LocalDate.now());
			//SET STATUS
			if(this.roleService.findById(user.getRole().getId()).getName().equals(Role.candidate)) entity.setStatus(UserDTO.active);
			else	entity.setStatus(UserDTO.notAvilable);
			//FILE
			entity.setRole(this.roleService.findById(user.getRole().getId()));//Default set role Candidate
			return this.mapperUser.mapUser(this.userRepository.save(entity));
		

	}

	

}
