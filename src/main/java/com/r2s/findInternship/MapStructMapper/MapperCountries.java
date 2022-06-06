package com.r2s.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.r2s.findInternship.DTO.CountriesDTO;
import com.r2s.findInternship.Entity.Countries;

@Mapper(componentModel = "spring")
public interface MapperCountries {
	Countries map(CountriesDTO dto);
	CountriesDTO map(Countries entity);

}
