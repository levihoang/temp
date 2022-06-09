package com.r2s.findInternship.MapStructMapper.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.r2s.findInternship.DTO.PartnerDTO;
import com.r2s.findInternship.Entity.Partner;
import com.r2s.findInternship.MapStructMapper.MapperPartner;
import com.r2s.findInternship.MapStructMapper.MapperUser;
@Component
public class MapperPartnerImpl implements MapperPartner {
	@Autowired
	private MapperUser mapperUser;
	@Override
	public Partner map(PartnerDTO dto) {
		if(dto == null)
		return null;
		Partner entity = new Partner();
		entity.setUser(this.mapperUser.mapUser(dto.getUser()));
		entity.setPosition(dto.getPosition());
//		entity.setDemandUni(dto.getDemandUni());
		return entity;
	}

	@Override
	public PartnerDTO map(Partner dto) {
		if(dto == null)
		return null;
		PartnerDTO entity = new PartnerDTO();
		entity.setUser(this.mapperUser.mapUser(dto.getUser()));
		entity.setPosition(dto.getPosition());
//		entity.setDemandUni(dto.getDemandUni());
		return entity;
	}
	
}
