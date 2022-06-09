package com.r2s.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.r2s.findInternship.DTO.CandidateDTO;
import com.r2s.findInternship.Entity.Candidate;

@Mapper(componentModel = "spring")
public interface MapperCandidate {
	Candidate map(CandidateDTO dto);
	CandidateDTO map(Candidate dto);

}
