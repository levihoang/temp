package com.pts.findInternship.MapStructMapper.Impl;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pts.findInternship.DTO.JobDTO;
import com.pts.findInternship.Entity.Job;
import com.pts.findInternship.MapStructMapper.MapperJob;
import com.pts.findInternship.MapStructMapper.MapperJobPosition;
@Component
public class MapperJobImpl implements MapperJob{
	@Autowired
	private MapperJobPosition mapperJob;
	@Override
	public Job map(JobDTO dto) {
		if(dto == null)
		return null;
		Job j = new Job();
		j.setId(dto.getId());
		j.setDesciption(dto.getDesciption());
		j.setJobposition(mapperJob.map(dto.getJobposition()));
		j.setName(dto.getName());
		j.setOtherInfo(dto.getOtherInfo());
		j.setRequirement(dto.getRequirement());
		j.setSalaryMin(dto.getSalaryMin());
		j.setSalaryMax(dto.getSalaryMax());
		j.setStatus(dto.isStatus());
		j.setTimeStart(LocalDate.parse(dto.getTimeStartStr()));
		j.setTimeEnd(LocalDate.parse(dto.getTimeStartStr()));
		j.setCreateDate(LocalDate.now());
//		j.setCountActive(null);
//		j.setHr(null);
		j.setJobposition(this.mapperJob.map(dto.getJobposition()));
		j.setAmount(dto.getAmount());
		return j;
		
	}

	@Override
	public JobDTO map(Job dto) {
		if(dto == null)
		return null;
		JobDTO j = new JobDTO();
		j.setId(dto.getId());
		j.setDesciption(dto.getDesciption());
		j.setJobposition(this.mapperJob.map(dto.getJobposition()));
		j.setName(dto.getName());
		j.setOtherInfo(dto.getOtherInfo());
		j.setRequirement(dto.getRequirement());
		j.setSalaryMin(dto.getSalaryMin());
		j.setSalaryMax(dto.getSalaryMax());
		j.setStatus(dto.isStatus());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		if(dto.getTimeStart()!=null && dto.getTimeEnd() != null)
		{
			j.setTimeStartStr(format.format(dto.getTimeStart()));
			j.setTimeEndStr(format.format(dto.getTimeEnd()));
		}
		j.setCreateDate(dto.getCreateDate());
//		j.setCountActive(null);
//		j.setHr(null);
		j.setJobposition(this.mapperJob.map(dto.getJobposition()));
		j.setAmount(dto.getAmount());
		return j;
	}
	
}
