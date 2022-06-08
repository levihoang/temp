package com.r2s.findInternship.Service.Impl;

import java.lang.module.ResolutionException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2s.findInternship.DTO.JobDTO;
import com.r2s.findInternship.Entity.Job;
import com.r2s.findInternship.Entity.JobPosition;
import com.r2s.findInternship.Entity.Major;
import com.r2s.findInternship.Exception.InternalServerErrorException;
import com.r2s.findInternship.Exception.ResourceNotFound;
import com.r2s.findInternship.MapStructMapper.MapperJob;
import com.r2s.findInternship.Repository.JobRepository;
import com.r2s.findInternship.Repository.MajorRepository;
import com.r2s.findInternship.Service.JobPositionService;
import com.r2s.findInternship.Service.JobService;

@Service
public class JobServiceImpl implements JobService {
	@Autowired
	private JobRepository jobRepository;
	@Autowired
	private MapperJob mapperJob;
	@Autowired
	private JobPositionService jobPositionService;
	@Autowired
	private MajorRepository majorRepository;
	@Override
	public JobDTO save(JobDTO entity) {
		JobPosition jobPosition = this.jobPositionService.findById(entity.getJobposition().getId())
				.orElseThrow(() -> new InternalServerErrorException("Job Position not found"));
		Job job = this.mapperJob.map(entity);
		job.setJobposition(jobPosition);
		Major major = this.majorRepository.findById(entity.getMajor().getId()).orElseThrow(()-> new InternalServerErrorException("Major is not suitable!"));
		job.setMajor(major);
		if(entity.getCreateDate() == null)
			job.setCreateDate(LocalDate.now());
		if (entity.getTimeStartStr() != null && entity.getTimeEndStr() != null) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			job.setTimeStart(LocalDate.parse(entity.getTimeStartStr(),formatter));
			job.setTimeEnd(LocalDate.parse(entity.getTimeEndStr(),formatter));
			if (job.getTimeEnd().compareTo(job.getTimeStart()) < 0) {
				throw new InternalServerErrorException("Time Start and Time End is not suitable!");
			}
		}
		job.setStatus(false);
		return this.mapperJob.map(jobRepository.save(job));
	}

	@Override
	public List<JobDTO> findAll() {
		return jobRepository.findAll().stream().map(item -> this.mapperJob.map(item)).collect(Collectors.toList());
	}

	@Override
	public JobDTO findById(Integer id) {
		return this.mapperJob.map(
				jobRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Job","id",String.valueOf(id))));
	}

	@Override
	public boolean existsById(Integer id) {
		return jobRepository.existsById(id);
	}

	@Override
	public long count() {
		return jobRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		if(!this.existsById(id)) throw new ResourceNotFound("Job","id",String.valueOf(id));
		jobRepository.deleteById(id);
	}

	@Override
	public List<JobDTO> findByNameContaining(String name) {
		if(name == "") return this.findAll();
		return jobRepository.findByNameContaining(name).stream().map(item -> this.mapperJob.map(item)).collect(Collectors.toList());
	}

	@Override
	public JobDTO update(int id, JobDTO entity) {
		Job jobOld = jobRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Job","id",String.valueOf(id)));
		Job current = this.mapperJob.map(entity);
		current.setId(jobOld.getId());
		return this.mapperJob.map(this.jobRepository.save(current));
	}

}
