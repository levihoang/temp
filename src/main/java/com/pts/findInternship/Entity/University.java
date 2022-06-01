package com.pts.findInternship.Entity;

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
@Entity
@Table(name = "University")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String avatar;
	private String shortName;
	private String description;
	private String website;
	private String email;
	private String phone;
	@ManyToMany
	@JoinTable(name = "University_Job",
	joinColumns = {@JoinColumn(name="UniversityId")}, inverseJoinColumns = {@JoinColumn(name="JobId")})
	private Set<Major> majors = new HashSet<Major>();
	@ManyToMany(mappedBy = "universities", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Location> locations;
	private int type;
	private Date createDate;
	private String status;
	
	
}
