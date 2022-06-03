/**
 * 
 */
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
