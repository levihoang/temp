package com.r2s.findInternship.MapStructMapper;

import org.mapstruct.Mapper;

import com.r2s.findInternship.DTO.LocationDTO;
import com.r2s.findInternship.Entity.Location;

@Mapper(componentModel = "spring")
public interface MapperLocation {
	Location map(LocationDTO dto);
	LocationDTO map(Location entity);
	LocationDTO mapDetails(Location dto);
}
