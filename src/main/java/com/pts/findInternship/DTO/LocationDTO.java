package com.pts.findInternship.DTO;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class LocationDTO {

	private String city;
	private String district;
	private String ward;
	private String street;
	private Set<CompanyDTO> companies;
	private Set<UniversityDTO> universities;
	private Set<JobDTO> jobs;
	
}
