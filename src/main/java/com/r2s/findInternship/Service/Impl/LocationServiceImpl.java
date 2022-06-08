package com.r2s.findInternship.Service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2s.findInternship.DTO.LocationDTO;
import com.r2s.findInternship.Entity.Location;
import com.r2s.findInternship.Exception.ResourceNotFound;
import com.r2s.findInternship.MapStructMapper.MapperLocation;
import com.r2s.findInternship.Repository.LocationRepository;
import com.r2s.findInternship.Service.LocationService;
@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository locationRepository;
	@Autowired
	private MapperLocation mapperLocation;

	@Override
	public <S extends Location> S save(S entity) {
		return locationRepository.save(entity);
	}

	@Override
	public List<Location> findAll() {
		return locationRepository.findAll();
	}

	@Override
	public Location findById(Integer id) {
		return locationRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Location","id",String.valueOf(id)));
	}

	@Override
	public boolean existsById(Integer id) {
		return locationRepository.existsById(id);
	}

	@Override
	public long count() {
		return locationRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		if(!this.existsById(id)) throw new ResourceNotFound("Location","id",String.valueOf(id));
		locationRepository.deleteById(id);
	}
	
}
