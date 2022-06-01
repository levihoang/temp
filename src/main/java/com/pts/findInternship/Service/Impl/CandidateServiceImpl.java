package com.pts.findInternship.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.pts.findInternship.DTO.CandidateDTO;
import com.pts.findInternship.Entity.Candidate;
import com.pts.findInternship.Exception.ResourceNotFound;
import com.pts.findInternship.Repository.CandidateRepository;
import com.pts.findInternship.Service.CandidateService;
@Service
public class CandidateServiceImpl implements CandidateService{
	@Autowired
	private CandidateRepository candidateRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CandidateDTO save(CandidateDTO s) {
		Candidate student = this.modelMapper.map(s, Candidate.class);
		return this.modelMapper.map(student, CandidateDTO.class);
	}

	@Override
	public List<CandidateDTO> findAll() {
		return candidateRepository.findAll().stream().map(
				student -> this.modelMapper.map(student, CandidateDTO.class)
				).collect(Collectors.toList());
				
	}

	@Override
	public CandidateDTO findById(Integer id) {
		Candidate s = this.candidateRepository.findById(id).orElseThrow(()-> new ResourceNotFound(String.format("Student not found with id:%s", id)));
		return this.modelMapper.map(s, CandidateDTO.class);
	}

	@Override
	public void flush() {
		candidateRepository.flush();
	}

	@Override
	public boolean existsById(Integer id) {
		return candidateRepository.existsById(id);
	}

	@Override
	public long count() {
		return candidateRepository.count();
	}

	@Override
	public <S extends Candidate> boolean exists(Example<S> example) {
		return candidateRepository.exists(example);
	}

	@Override
	public void deleteById(Integer id) {
		if(!this.candidateRepository.existsById(id)) throw new ResourceNotFound(String.format("Student not found with id:%s", id));
		candidateRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		candidateRepository.deleteAll();
	}

	@Override
	public CandidateDTO update(CandidateDTO s, int id) {
		Candidate student = this.candidateRepository.findById(id).orElseThrow(()-> new ResourceNotFound(String.format("Student not found with id:%s", id)));
//		student.setFirstName(s.getFirstName());
//		student.setLastName(s.getLastName());
		return this.modelMapper.map(this.candidateRepository.save(student), CandidateDTO.class);
	}
	
}
