package com.r2s.findInternship.Service;

import java.util.List;
import java.util.Optional;

import com.r2s.findInternship.Entity.JobPosition;

public interface JobPositionService {

	void deleteById(Integer id);

	long count();

	boolean existsById(Integer id);

	Optional<JobPosition> findById(Integer id);

	List<JobPosition> findAll();

	<S extends JobPosition> S save(S entity);

	boolean existsByName(String name);

}
