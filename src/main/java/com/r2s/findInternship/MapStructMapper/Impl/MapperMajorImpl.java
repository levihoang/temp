package com.r2s.findInternship.MapStructMapper.Impl;

import org.springframework.stereotype.Component;

import com.r2s.findInternship.DTO.MajorDTO;
import com.r2s.findInternship.Entity.Major;
import com.r2s.findInternship.MapStructMapper.MapperMajor;
@Component
public class MapperMajorImpl implements MapperMajor {

	@Override
	public Major mapMajor(MajorDTO dto) {
		if(dto == null) return null;
		Major entity = new Major();
		if(dto.getId() != 0) entity.setId(dto.getId());
		entity.setName(dto.getName());
		return entity;
	}

	@Override
	public MajorDTO mapMajor(Major entity) {
		if(entity == null) return null;
		MajorDTO dto = new MajorDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		return dto;
	}

}
