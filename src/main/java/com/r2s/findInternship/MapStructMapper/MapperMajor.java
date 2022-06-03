package com.r2s.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.r2s.findInternship.DTO.MajorDTO;
import com.r2s.findInternship.Entity.Major;

@Mapper(componentModel = "spring")
public interface MapperMajor {
	Major mapMajor(MajorDTO dto);
	MajorDTO mapMajor(Major dto);
	
}
