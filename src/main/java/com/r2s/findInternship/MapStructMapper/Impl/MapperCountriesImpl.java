package com.r2s.findInternship.MapStructMapper.Impl;

import org.springframework.stereotype.Component;

import com.r2s.findInternship.DTO.CountriesDTO;
import com.r2s.findInternship.Entity.Countries;
import com.r2s.findInternship.MapStructMapper.MapperCountries;
@Component
public class MapperCountriesImpl implements MapperCountries {

	@Override
	public Countries map(CountriesDTO dto) {
		if(dto == null)
		return null;
		Countries entity = new Countries();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setAreaCode(dto.getAreaCode());
		entity.setCreateDate(dto.getCreateDate());
		return entity;
	}

	@Override
	public CountriesDTO map(Countries entity) {
		if(entity == null)
		return null;
		CountriesDTO dto = new CountriesDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setAreaCode(entity.getAreaCode());
		dto.setCreateDate(entity.getCreateDate());
		return dto;
	}
	
}
