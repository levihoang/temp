package com.pts.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.pts.findInternship.DTO.JobPositionDTO;
import com.pts.findInternship.Entity.JobPosition;

@Mapper(componentModel = "spring")
public interface MapperJobPosition {
	JobPositionDTO map(JobPosition dto);
	JobPosition map(JobPositionDTO dto);
}
