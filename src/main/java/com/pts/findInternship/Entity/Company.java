/**
 * 
 */
package com.pts.findInternship.Entity;

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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "company")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name",columnDefinition = "NVARCHAR(255)",nullable = true)
	private String name;
	@Column(name = "logo",columnDefinition = "varchar(100)")
	private String logo;
	@Column(name = "description",columnDefinition = "NVARCHAR(255)")
	private String description;
	@Column(name = "website",columnDefinition = "VARCHAR(100)")
	private String website;
	@Column(name = "email",columnDefinition = "VARCHAR(100)")
	private String email;
	@Column(name = "phone",columnDefinition = "VARCHAR(10)")
	private String phone;
	@ManyToMany(mappedBy = "companies", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Location> locations = new HashSet<Location>();
	//HR
	private int type;
	@Column(name = "date",columnDefinition = "DATE")
	private LocalDate date;
	private String status;
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Rate> rates = new HashSet<Rate>();
	
}
