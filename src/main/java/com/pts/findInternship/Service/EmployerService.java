package com.pts.findInternship.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

import com.pts.findInternship.Entity.Company;

public interface EmployerService {

	void deleteById(Integer id);

	<S extends Company> boolean exists(Example<S> example);

	long count();

	boolean existsById(Integer id);

	Optional<Company> findById(Integer id);

	List<Company> findAll();

	<S extends Company> S save(S entity);

}
