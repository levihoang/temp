package com.pts.findInternship.Service;

import java.util.List;

import com.pts.findInternship.DTO.JobDTO;

public interface JobService {

	List<JobDTO> findByNameContaining(String name);

	void deleteById(Integer id);

	long count();

	boolean existsById(Integer id);

	JobDTO findById(Integer id);

	List<JobDTO> findAll();

	JobDTO save(JobDTO entity);

}
