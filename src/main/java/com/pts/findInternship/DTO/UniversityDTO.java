package com.pts.findInternship.DTO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class UniversityDTO {


	private String name;
	private String avatar;
	private String shortName;
	private String description;
	private String website;
	private String email;
	private String phone;
	private Set<MajorDTO> majors = new HashSet<MajorDTO>();
	private Set<LocationDTO> locations;
	private int type;
	private LocalDate createDate;
	private String status;
	
	
}
