package com.r2s.findInternship.Entity;

import java.io.Serializable;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Location")
public class Location implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "district_id")
	@JsonIgnore
	private District district;
	private String address;
	private String note;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable( name =  "Company_Location" ,joinColumns = {@JoinColumn(name="CompanyId")}, inverseJoinColumns = {@JoinColumn(name="LocationId")})
	private Set<Company> companies = new HashSet<Company>();
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable( name =  "University_Location" ,
		joinColumns = {@JoinColumn(name="UniversityId")}, inverseJoinColumns = {@JoinColumn(name="LocationId")}
			)
	private Set<University> universities = new HashSet<University>();
	
	@OneToMany(mappedBy = "locationjob",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Job> jobs = new HashSet<Job>();
	
}
