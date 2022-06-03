package com.pts.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.pts.findInternship.DTO.UserCreationDTO;
import com.pts.findInternship.DTO.UserDTO;
import com.pts.findInternship.Entity.User;

@Mapper(componentModel = "spring")
public interface MapperUser {
	User mapUser(UserDTO dto);
	UserDTO mapUser(User entity);
	User mapUser(UserCreationDTO dto);

}
