package com.r2s.findInternship.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Location")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	@ManyToOne
//	@JoinColumn(name = "ward_id")
//	private Ward ward;
//	@ManyToOne
//	@JoinColumn(name = "district_id")
//	private District district;
	private String address;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable( name =  "Company_Location" ,
		joinColumns = {@JoinColumn(name="CompanyId")}, inverseJoinColumns = {@JoinColumn(name="LocationId")}
			)
	private Set<Company> companies = new HashSet<Company>();
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable( name =  "University_Location" ,
		joinColumns = {@JoinColumn(name="UniversityId")}, inverseJoinColumns = {@JoinColumn(name="LocationId")}
			)
	private Set<University> universities = new HashSet<University>();
	
	@OneToMany(mappedBy = "locationjob",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Job> jobs = new HashSet<Job>();
	
}
