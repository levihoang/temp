package com.r2s.findInternship.DTO;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	private UserCreationDTO createUser;
	
}
