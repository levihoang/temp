package com.r2s.findInternship.MapStructMapper.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.r2s.findInternship.DTO.DistrictDTO;
import com.r2s.findInternship.Entity.District;
import com.r2s.findInternship.MapStructMapper.MapperDistrict;
import com.r2s.findInternship.MapStructMapper.MapperProvince;
@Component
public class MapperDistrictImpl implements MapperDistrict {
	@Autowired
	private MapperProvince mapperProvince;
	@Override
	public District map(DistrictDTO dto) {
		if(dto == null)
		return null;
		District d = new District();
		d.setId(dto.getId());
		d.setName(dto.getName());
		d.setPrefix(dto.getPrefix());
		d.setProvince(this.mapperProvince.map(dto.getProvinceDTO()));
		return d;
	}

	@Override
	public DistrictDTO map(District dto) {
		if(dto == null)
			return null;
			DistrictDTO d = new DistrictDTO();
			d.setId(dto.getId());
			d.setName(dto.getName());
			d.setPrefix(dto.getPrefix());
			return d;
	}

}
