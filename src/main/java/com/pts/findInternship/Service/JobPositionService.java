package com.pts.findInternship.Service;

import java.util.List;
import java.util.Optional;

import com.pts.findInternship.Entity.JobPosition;

public interface JobPositionService {

	void deleteById(Integer id);

	long count();

	boolean existsById(Integer id);

	Optional<JobPosition> findById(Integer id);

	List<JobPosition> findAll();

	<S extends JobPosition> S save(S entity);

	boolean existsByName(String name);

}
