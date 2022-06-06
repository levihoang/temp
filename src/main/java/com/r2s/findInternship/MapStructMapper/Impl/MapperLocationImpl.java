package com.r2s.findInternship.MapStructMapper.Impl;

import org.springframework.stereotype.Component;

import com.r2s.findInternship.DTO.LocationDTO;
import com.r2s.findInternship.Entity.Location;
import com.r2s.findInternship.MapStructMapper.MapperLocation;
@Component
public class MapperLocationImpl implements MapperLocation {

	@Override
	public Location map(LocationDTO dto) {
		if(dto == null)
		return null;
		Location local = new Location();
		local.setId(dto.getId());
		local.setAddress(dto.getAddress());
		local.setDistrict(dto.getDistrict());
		local.setNote(dto.getNote());
		return local;
	}

	@Override
	public LocationDTO map(Location dto) {
		if(dto == null)
			return null;
			LocationDTO local = new LocationDTO();
			local.setId(dto.getId());
			local.setAddress(dto.getAddress());
			local.setDistrict(dto.getDistrict());
			local.setNote(dto.getNote());
			local.setCompanies(dto.getCompanies());
			local.setUniversities(dto.getUniversities());
			return local;
	}

	@Override
	public LocationDTO mapDetails(Location dto) {
		if(dto == null)
			return null;
			LocationDTO local = new LocationDTO();
			local.setId(dto.getId());
			local.setAddress(dto.getAddress());
			local.setDistrict(dto.getDistrict());
			local.setNote(dto.getNote());
			return local;
	}

}
