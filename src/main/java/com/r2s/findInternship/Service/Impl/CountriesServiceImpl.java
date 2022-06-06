package com.r2s.findInternship.Service.Impl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2s.findInternship.DTO.CountriesDTO;
import com.r2s.findInternship.Entity.Countries;
import com.r2s.findInternship.Exception.ResourceNotFound;
import com.r2s.findInternship.MapStructMapper.MapperCountries;
import com.r2s.findInternship.Repository.CountriesRepository;
import com.r2s.findInternship.Service.CountriesService;
@Service
public class CountriesServiceImpl implements CountriesService {
	@Autowired
	private CountriesRepository countriesRepository;
	@Autowired
	private MapperCountries mapperCountries;

	@Override
	public <S extends Countries> S save(S entity) {
		entity.setCreateDate(LocalDate.now());
		return countriesRepository.save(entity);
	}

	@Override
	public List<CountriesDTO> findAll() {
		return countriesRepository.findAll().stream().map(item -> this.mapperCountries.map(item)).collect(Collectors.toList());
	}

	@Override
	public CountriesDTO findById(Integer id) {
		Countries c = this.countriesRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Countries not found with id: " + id));
		return this.mapperCountries.map(c);
	}

	@Override
	public boolean existsById(Integer id) {
		return countriesRepository.existsById(id);
	}

	@Override
	public long count() {
		return countriesRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		countriesRepository.deleteById(id);
	}
	
}
