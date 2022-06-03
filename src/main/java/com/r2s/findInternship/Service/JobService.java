package com.r2s.findInternship.Service;

import java.util.List;

import com.r2s.findInternship.DTO.JobDTO;

public interface JobService {

	List<JobDTO> findByNameContaining(String name);

	void deleteById(Integer id);

	long count();

	boolean existsById(Integer id);

	JobDTO findById(Integer id);

	List<JobDTO> findAll();

	JobDTO save(JobDTO entity);
	
	JobDTO update(int id, JobDTO entity);

}
