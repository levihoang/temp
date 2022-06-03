package com.r2s.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.r2s.findInternship.DTO.JobDTO;
import com.r2s.findInternship.Entity.Job;

@Mapper(componentModel = "spring")
public interface MapperJob {
	Job map(JobDTO dto);
	JobDTO map(Job entity);
}
