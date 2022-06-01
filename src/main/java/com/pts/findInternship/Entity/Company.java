/**
 * 
 */
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
	private String name;
	private String logo;
	private String description;
	private String website;
	private String email;
	private String phone;
	@ManyToMany(mappedBy = "companies", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Location> locations = new HashSet<Location>();
	//HR
	private int type;
	private Date date;
	private String status;
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Rate> rates = new HashSet<Rate>();
	
}
