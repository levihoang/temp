package com.r2s.findInternship.DTO;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.r2s.findInternship.Entity.Company;
import com.r2s.findInternship.Entity.District;
import com.r2s.findInternship.Entity.Job;
import com.r2s.findInternship.Entity.University;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class LocationDTO {

	private int id;
	private District district;
	private String address;
	private String note;
	private Set<Company> companies = new HashSet<Company>();
	private Set<University> universities = new HashSet<University>();
	private Set<Job> jobs = new HashSet<Job>();
	
}
