package com.r2s.findInternship.MapStructMapper.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.r2s.findInternship.DTO.JobPositionDTO;
import com.r2s.findInternship.Entity.JobPosition;
import com.r2s.findInternship.MapStructMapper.MapperJob;
import com.r2s.findInternship.MapStructMapper.MapperJobPosition;
@Component
public class MapperJobPositionImpl implements MapperJobPosition {
	@Autowired
	private MapperJob mapperJob;
	@Override
	public JobPositionDTO map(JobPosition dto) {
		if(dto == null)
		return null;
		JobPositionDTO entity = new JobPositionDTO();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
//		entity.setJobs(mapperJob.map(dto.getJobs()));
//		entity.setDemandUnis(dto.getDemandUnis());
		return entity;
	}

	@Override
	public JobPosition map(JobPositionDTO dto) {
		if(dto == null)
			return null;
			JobPosition entity = new JobPosition();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
//			entity.setJobs(dto.getJobs());
//			entity.setDemandUnis(dto.getDemandUnis());
			return entity;
	}

}
