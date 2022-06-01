package com.pts.findInternship.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import com.pts.findInternship.Entity.Company;
import com.pts.findInternship.Repository.EmployerRepository;
import com.pts.findInternship.Service.EmployerService;

public class EmployerServiceImpl implements EmployerService {
	@Autowired
	private EmployerRepository employerRepository;

	@Override
	public <S extends Company> S save(S entity) {
		return employerRepository.save(entity);
	}

	@Override
	public List<Company> findAll() {
		return employerRepository.findAll();
	}

	@Override
	public Optional<Company> findById(Integer id) {
		return employerRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return employerRepository.existsById(id);
	}

	@Override
	public long count() {
		return employerRepository.count();
	}

	@Override
	public <S extends Company> boolean exists(Example<S> example) {
		return employerRepository.exists(example);
	}

	@Override
	public void deleteById(Integer id) {
		employerRepository.deleteById(id);
	}
	
}
