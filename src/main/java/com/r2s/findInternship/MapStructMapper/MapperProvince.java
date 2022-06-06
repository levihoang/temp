package com.r2s.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.r2s.findInternship.DTO.ProvinceDTO;
import com.r2s.findInternship.Entity.Province;

@Mapper(componentModel = "spring")
public interface MapperProvince {
	Province map(ProvinceDTO dto);
	ProvinceDTO map(Province dto);
}
