package com.pts.findInternship.Service.Impl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pts.findInternship.DTO.JobDTO;
import com.pts.findInternship.Entity.Job;
import com.pts.findInternship.Entity.JobPosition;
import com.pts.findInternship.Exception.InternalServerErrorException;
import com.pts.findInternship.Exception.ResourceNotFound;
import com.pts.findInternship.MapStructMapper.MapperJob;
import com.pts.findInternship.Repository.JobRepository;
import com.pts.findInternship.Service.JobPositionService;
import com.pts.findInternship.Service.JobService;

@Service
public class JobServiceImpl implements JobService {
	@Autowired
	private JobRepository jobRepository;
	@Autowired
	private MapperJob mapperJob;
	@Autowired
	private JobPositionService jobPositionService;

	@Override
	public JobDTO save(JobDTO entity) {
		JobPosition jobPosition = this.jobPositionService.findById(entity.getJobposition().getId())
				.orElseThrow(() -> new InternalServerErrorException("Job Position not found"));
		Job job = this.mapperJob.map(entity);
		job.setJobposition(jobPosition);
		job.setCreateDate(LocalDate.now());
		if (entity.getTimeStartStr() != null && entity.getTimeEndStr() != null) {
			job.setTimeStart(LocalDate.parse(entity.getTimeStartStr()));
			job.setTimeEnd(LocalDate.parse(entity.getTimeEndStr()));
			if (job.getTimeEnd().compareTo(job.getTimeStart()) < 0) {
				throw new InternalServerErrorException("Time Start and Time End is not suitable!");
			}
		}
		return this.mapperJob.map(jobRepository.save(job));
	}

	@Override
	public List<JobDTO> findAll() {
		return jobRepository.findAll().stream().map(item -> this.mapperJob.map(item)).collect(Collectors.toList());
	}

	@Override
	public JobDTO findById(Integer id) {
		return this.mapperJob.map(
				jobRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Job not found with id: " + id)));
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
		jobRepository.deleteById(id);
	}

	@Override
	public List<JobDTO> findByNameContaining(String name) {
		return jobRepository.findByNameContaining(name).stream().map(item -> this.mapperJob.map(item))
				.collect(Collectors.toList());
	}

}
