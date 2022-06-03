package com.r2s.findInternship.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2s.findInternship.Entity.JobPosition;
import com.r2s.findInternship.Exception.InternalServerErrorException;
import com.r2s.findInternship.Repository.JobPositionRepository;
import com.r2s.findInternship.Service.JobPositionService;
@Service
public class JobPositionServiceIml implements JobPositionService {
	@Autowired
	private JobPositionRepository jobPositionRepository;

	@Override
	public <S extends JobPosition> S save(S entity) {
		if(this.existsByName(entity.getName())) throw new InternalServerErrorException(String.format("Job Position is exists in my system wiht %s, so you cann't add it", entity.getName()));
		return jobPositionRepository.save(entity);
	}

	@Override
	public List<JobPosition> findAll() {
		return jobPositionRepository.findAll();
	}

	@Override
	public Optional<JobPosition> findById(Integer id) {
		return jobPositionRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return jobPositionRepository.existsById(id);
	}

	@Override
	public long count() {
		return jobPositionRepository.count();
	}

	@Override
	public boolean existsByName(String name) {
		return jobPositionRepository.existsByName(name);
	}

	@Override
	public void deleteById(Integer id) {
		jobPositionRepository.deleteById(id);
	}
	
	
}
