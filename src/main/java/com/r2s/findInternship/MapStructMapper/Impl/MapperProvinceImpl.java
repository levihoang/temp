package com.r2s.findInternship.MapStructMapper.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.r2s.findInternship.DTO.ProvinceDTO;
import com.r2s.findInternship.Entity.Province;
import com.r2s.findInternship.MapStructMapper.MapperCountries;
import com.r2s.findInternship.MapStructMapper.MapperProvince;
@Component
public class MapperProvinceImpl implements MapperProvince {
	@Autowired
	private MapperCountries mapperCountries;
	@Override
	public Province map(ProvinceDTO dto) {
		if(dto == null)
		return null;
		Province p = new Province();
		p.setName(dto.getName());
		p.setShortName(dto.getShortName());
		p.setDistricts(dto.getDistricts());
		return p;
	}

	@Override
	public ProvinceDTO map(Province dto) {
		if(dto == null)
			return null;
			ProvinceDTO p = new ProvinceDTO();
			p.setId(dto.getId());
			p.setName(dto.getName());
			p.setShortName(dto.getShortName());
			p.setDistricts(dto.getDistricts());
			return p;
	}

}
