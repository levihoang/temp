/**
 * 
 */
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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyDTO {
	private int id;
	private String name;
	private String logo;
	private String description;
	private String website;
	private String email;
	private String phone;
	//HR
	private int type;
	private LocalDate date;
	private String status;
	private Set<RateDTO> rates = new HashSet<RateDTO>();
	
}
