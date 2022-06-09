package com.r2s.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.r2s.findInternship.DTO.PartnerDTO;
import com.r2s.findInternship.Entity.Partner;

@Mapper(componentModel = "spring")
public interface MapperPartner {
	Partner map(PartnerDTO dto);
	PartnerDTO map(Partner dto);
}
