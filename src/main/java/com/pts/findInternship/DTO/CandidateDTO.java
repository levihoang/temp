package com.pts.findInternship.DTO;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class CandidateDTO {

	private int id;	
	private String CV;
	private MultipartFile fileCV;
	private UserDTO user;
	private MajorDTO major;
	private Set<CareListDTO> careJobs = new HashSet<CareListDTO>();
	
}
