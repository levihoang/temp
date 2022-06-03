package com.r2s.findInternship.MapStructMapper.Impl;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.r2s.findInternship.DTO.JobDTO;
import com.r2s.findInternship.Entity.Job;
import com.r2s.findInternship.MapStructMapper.MapperJob;
import com.r2s.findInternship.MapStructMapper.MapperJobPosition;
import com.r2s.findInternship.MapStructMapper.MapperMajor;
@Component
public class MapperJobImpl implements MapperJob{
	@Autowired
	private MapperJobPosition mapperJob;
	@Autowired 
	private MapperMajor mapperMajor;
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
		j.setMajor(this.mapperMajor.mapMajor(dto.getMajor()));
		//LocalDate to String
		DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
		        .append(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toFormatter();
		j.setTimeStart(LocalDate.parse(dto.getTimeStartStr(),formatter));
		j.setTimeEnd(LocalDate.parse(dto.getTimeEndStr(),formatter));
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
		j.setMajor(this.mapperMajor.mapMajor(dto.getMajor()));
		//LocalDate to String
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		if(dto.getTimeStart()!=null && dto.getTimeEnd() != null)
		{
			j.setTimeStartStr(dto.getTimeStart().format(format));
			j.setTimeEndStr(dto.getTimeEnd().format(format));
		}
		j.setCreateDate(dto.getCreateDate());
//		j.setCountActive(null);
//		j.setHr(null);
		j.setJobposition(this.mapperJob.map(dto.getJobposition()));
		j.setAmount(dto.getAmount());
		return j;
	}
	
}
