package com.r2s.findInternship.MapStructMapper.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.r2s.findInternship.DTO.CandidateDTO;
import com.r2s.findInternship.Entity.Candidate;
import com.r2s.findInternship.MapStructMapper.MapperCandidate;
import com.r2s.findInternship.MapStructMapper.MapperMajor;
import com.r2s.findInternship.MapStructMapper.MapperUser;
@Component
public class MapperCandidateImpl implements MapperCandidate {
	@Autowired
	private MapperMajor mapperMajor;
	@Autowired
	private MapperUser mapperUser;
	@Override
	public Candidate map(CandidateDTO dto) {
		if(dto == null)
		return null;
		Candidate entity = new Candidate();
		entity.setMajor(this.mapperMajor.mapMajor(dto.getMajor()));
		entity.setUser(mapperUser.mapUser(dto.getUser()));
		//entity.setCV(null);
		return entity;
	}

	@Override
	public CandidateDTO map(Candidate dto) {
		if(dto == null)
			return null;
			CandidateDTO entity = new CandidateDTO();
			entity.setMajor(this.mapperMajor.mapMajor(dto.getMajor()));
			entity.setUser(mapperUser.mapUser(dto.getUser()));
			//entity.setCV(null);
			return entity;
	}

}
