package com.r2s.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.r2s.findInternship.DTO.UserCreationDTO;
import com.r2s.findInternship.DTO.UserDTO;
import com.r2s.findInternship.Entity.User;

@Mapper(componentModel = "spring")
public interface MapperUser {
	User mapUser(UserDTO dto);
	UserDTO mapUser(User entity);
	User mapUser(UserCreationDTO dto);

}
