package com.r2s.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.r2s.findInternship.DTO.DistrictDTO;
import com.r2s.findInternship.Entity.District;

@Mapper(componentModel = "spring")
public interface MapperDistrict {
	District map(DistrictDTO dto);
	DistrictDTO map(District entity);
}
