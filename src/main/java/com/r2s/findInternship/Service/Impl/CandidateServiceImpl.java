package com.r2s.findInternship.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.r2s.findInternship.DTO.CandidateDTO;
import com.r2s.findInternship.DTO.UserCreationDTO;
import com.r2s.findInternship.DTO.UserDTO;
import com.r2s.findInternship.Entity.Candidate;
import com.r2s.findInternship.Exception.ResourceNotFound;
import com.r2s.findInternship.MapStructMapper.MapperCandidate;
import com.r2s.findInternship.MapStructMapper.MapperUser;
import com.r2s.findInternship.Repository.CandidateRepository;
import com.r2s.findInternship.Service.CandidateService;
import com.r2s.findInternship.Service.UserService;
@Service
public class CandidateServiceImpl implements CandidateService{
	@Autowired
	private CandidateRepository candidateRepository;
	@Autowired
	private UserService userService;
	@Autowired
	private MapperCandidate mapperCandidate;
	@Autowired
	private MapperUser mapperUser;
//
//
//	@Override
//	public CandidateDTO save(CandidateDTO s) {
//		Candidate student = this.modelMapper.map(s, Candidate.class);
//		return this.modelMapper.map(student, CandidateDTO.class);
//	}
//
//	@Override
//	public List<CandidateDTO> findAll() {
//		return candidateRepository.findAll().stream().map(
//				student -> this.modelMapper.map(student, CandidateDTO.class)
//				).collect(Collectors.toList());
//				
//	}
//
//	@Override
//	public CandidateDTO findById(Integer id) {
//		Candidate s = this.candidateRepository.findById(id).orElseThrow(()-> new ResourceNotFound(String.format("Student not found with id:%s", id)));
//		return this.modelMapper.map(s, CandidateDTO.class);
//	}
//
//	@Override
//	public void flush() {
//		candidateRepository.flush();
//	}
//
//	@Override
//	public boolean existsById(Integer id) {
//		return candidateRepository.existsById(id);
//	}
//
//	@Override
//	public long count() {
//		return candidateRepository.count();
//	}
//
//	@Override
//	public <S extends Candidate> boolean exists(Example<S> example) {
//		return candidateRepository.exists(example);
//	}
//
//	@Override
//	public void deleteById(Integer id) {
//		if(!this.candidateRepository.existsById(id)) throw new ResourceNotFound(String.format("Student not found with id:%s", id));
//		candidateRepository.deleteById(id);
//	}
//
//	@Override
//	public void deleteAll() {
//		candidateRepository.deleteAll();
//	}
//
//	@Override
//	public CandidateDTO update(CandidateDTO s, int id) {
//		Candidate student = this.candidateRepository.findById(id).orElseThrow(()-> new ResourceNotFound(String.format("Student not found with id:%s", id)));
////		student.setFirstName(s.getFirstName());
////		student.setLastName(s.getLastName());
//		return this.modelMapper.map(this.candidateRepository.save(student), CandidateDTO.class);
//	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Candidate> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CandidateDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CandidateDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CandidateDTO save(CandidateDTO s) {
		UserDTO u = this.userService.update(s.getCreateUser());
		Candidate candidate = this.mapperCandidate.map(s);
		candidate.setUser(this.mapperUser.mapUser(u));
		return this.mapperCandidate.map(this.candidateRepository.save(candidate));
	}

	@Override
	public CandidateDTO update(CandidateDTO s, int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
