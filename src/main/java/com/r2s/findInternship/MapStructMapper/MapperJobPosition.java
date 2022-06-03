package com.r2s.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.r2s.findInternship.DTO.JobPositionDTO;
import com.r2s.findInternship.Entity.JobPosition;

@Mapper(componentModel = "spring")
public interface MapperJobPosition {
	JobPositionDTO map(JobPosition dto);
	JobPosition map(JobPositionDTO dto);
}
