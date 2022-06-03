package com.pts.findInternship.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class RateDTO {
	private UserDTO user;
	private CompanyDTO company;
	private int score;
	private String comment;
	private LocalDate createDate;
	
}
