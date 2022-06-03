package com.pts.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.pts.findInternship.DTO.MajorDTO;
import com.pts.findInternship.DTO.UserCreationDTO;
import com.pts.findInternship.DTO.UserDTO;
import com.pts.findInternship.Entity.Major;
import com.pts.findInternship.Entity.User;

@Mapper(componentModel = "spring")
public interface MapperMajor {
	Major mapMajor(MajorDTO dto);
	MajorDTO mapMajor(Major dto);
	
}
