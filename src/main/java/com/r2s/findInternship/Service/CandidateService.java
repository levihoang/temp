package com.r2s.findInternship.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

import com.r2s.findInternship.DTO.CandidateDTO;
import com.r2s.findInternship.DTO.UserCreationDTO;
import com.r2s.findInternship.Entity.Candidate;

public interface CandidateService {

	void deleteAll();

	void deleteById(Integer id);

	<S extends Candidate> boolean exists(Example<S> example);

	long count();

	boolean existsById(Integer id);

	void flush();

	CandidateDTO findById(Integer id);

	List<CandidateDTO> findAll();

	CandidateDTO save(CandidateDTO s);
	CandidateDTO update(CandidateDTO s, int id);

}
