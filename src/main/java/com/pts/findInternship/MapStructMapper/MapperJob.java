package com.pts.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.pts.findInternship.DTO.JobDTO;
import com.pts.findInternship.Entity.Job;

@Mapper(componentModel = "spring")
public interface MapperJob {
	Job map(JobDTO dto);
	JobDTO map(Job entity);
}
