package com.r2s.findInternship.Service;

import java.util.List;

import com.r2s.findInternship.DTO.LocationDTO;
import com.r2s.findInternship.Entity.Location;

public interface LocationService {

	void deleteById(Integer id);

	long count();

	boolean existsById(Integer id);

	Location findById(Integer id);

	List<Location> findAll();

	<S extends Location> S save(S entity);

}
