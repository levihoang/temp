package com.r2s.findInternship.Service;

import java.util.List;
import java.util.Optional;

import com.r2s.findInternship.DTO.CountriesDTO;
import com.r2s.findInternship.Entity.Countries;

public interface CountriesService {

	void deleteById(Integer id);

	long count();

	boolean existsById(Integer id);

	CountriesDTO findById(Integer id);

	List<CountriesDTO> findAll();

	<S extends Countries> S save(S entity);

}
