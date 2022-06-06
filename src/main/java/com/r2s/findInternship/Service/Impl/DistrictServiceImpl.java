package com.r2s.findInternship.Service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2s.findInternship.DTO.DistrictDTO;
import com.r2s.findInternship.Entity.District;
import com.r2s.findInternship.Exception.ResourceNotFound;
import com.r2s.findInternship.MapStructMapper.MapperDistrict;
import com.r2s.findInternship.Repository.DistrictRepository;
import com.r2s.findInternship.Service.DistrictService;
@Service
public class DistrictServiceImpl implements DistrictService {
	@Autowired
	private DistrictRepository districtRepository;
	@Autowired
	private MapperDistrict mapperDistrict;
	public <S extends District> S save(S entity) {
		return districtRepository.save(entity);
	}

	public List<DistrictDTO> findAll() {
		return districtRepository.findAll().stream().map(item -> mapperDistrict.map(item) ).collect(Collectors.toList());
	}

	public DistrictDTO findById(Integer id) {
		District d =  districtRepository.findById(id).orElseThrow(()-> new ResourceNotFound("District not found with id: " + id));
		return this.mapperDistrict.map(d);
	}

	public boolean existsById(Integer id) {
		return districtRepository.existsById(id);
	}

	public long count() {
		return districtRepository.count();
	}

	public void deleteById(Integer id) {
		if(!existsById(id)) throw new ResourceNotFound("District not found with id: " + id);
		districtRepository.deleteById(id);
	}

	public void deleteAll() {
		districtRepository.deleteAll();
	}
	
}
