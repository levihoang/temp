package com.r2s.findInternship.Entity;

import java.time.LocalDate;
import java.util.Date;
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
	@Column(name = "name",nullable = false, columnDefinition = "NVARCHAR(255)")
	private String name;
	@Column(name = "avatar",nullable = false, columnDefinition = "VARCHAR(100)")
	private String avatar;
	@Column(name = "ShortName",nullable = false, columnDefinition = "NVARCHAR(50)")
	private String shortName;
	@Column(name = "description", columnDefinition = "NVARCHAR(500)")
	private String description;
	@Column(name = "website", columnDefinition = "VARCHAR(100)")
	private String website;
	@Column(name = "email",nullable = false, columnDefinition = "VARCHAR(100)")
	private String email;
	@Column(name = "phone",columnDefinition = "VARCHAR(10)")
	private String phone;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "University_Job",
	joinColumns = {@JoinColumn(name="UniversityId")}, inverseJoinColumns = {@JoinColumn(name="JobId")})
	private Set<Major> majors = new HashSet<Major>();
	@ManyToMany(mappedBy = "universities", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Location> locations;
	@Column(name = "type",columnDefinition = "INT(10)")
	private int type;
	private LocalDate createDate;
	@Column(name = "status",columnDefinition = "NVARCHAR(15)")
	private String status;
	
	
}
