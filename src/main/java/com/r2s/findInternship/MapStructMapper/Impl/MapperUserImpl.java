package com.r2s.findInternship.MapStructMapper.Impl;

import org.springframework.stereotype.Component;

import com.r2s.findInternship.DTO.UserCreationDTO;
import com.r2s.findInternship.DTO.UserDTO;
import com.r2s.findInternship.Entity.User;
import com.r2s.findInternship.MapStructMapper.MapperUser;
@Component
public class MapperUserImpl implements MapperUser{
	
	@Override
	public User mapUser(UserDTO dto) {
		if(dto == null) return null;
		User u = new User();
		u.setAvatar(dto.getAvatar());
		u.setEmail(dto.getEmail());
		u.setFirstName(dto.getFirstName());
		u.setGender(dto.isGender());
		u.setRole(dto.getRole());
		u.setUsername(dto.getUsername());
		u.setStatus(dto.getStatus());
		u.setPhone(dto.getPhone());
		return u;
		
	}

	@Override
	public UserDTO mapUser(User dto) {
		if(dto == null) return null;
		UserDTO u = new UserDTO();
		u.setAvatar(dto.getAvatar());
		u.setEmail(dto.getEmail());
		u.setFirstName(dto.getFirstName());
		u.setGender(dto.isGender());
		u.setRole(dto.getRole()); 
		u.setUsername(dto.getUsername());
		u.setStatus(dto.getStatus());
		u.setPhone(dto.getPhone());
		return u;
	}

	@Override
	public User mapUser(UserCreationDTO dto) {
		if(dto == null) 
		return null;
		User user = new User();
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		user.setRole(dto.getRole());
		return user;
	}

}
