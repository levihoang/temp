package com.r2s.findInternship.DTO;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

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
