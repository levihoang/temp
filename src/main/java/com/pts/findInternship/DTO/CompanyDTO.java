package com.pts.findInternship.DTO;

import java.sql.Date;

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
	//Location
	//HR
	//type
	private Date date;
	private String status;
}
