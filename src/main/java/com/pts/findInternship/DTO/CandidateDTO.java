package com.pts.findInternship.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CandidateDTO {

	private int id;
	private String CV;
	private UserDTO user;
}
