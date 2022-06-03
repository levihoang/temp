package com.r2s.findInternship.DTO;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class JobDTO {

	private int id;
	private String name;
	private HRDTO hr;
	private String desciption;
	private MajorDTO major;
	private JobPositionDTO jobposition;
	private int amount;
	private long salaryMin;
	private long salaryMax;
	private String requirement;
	private String otherInfo;
	private String timeStartStr;
	private String timeEndStr;
	private LocationDTO locationjob;
	private LocalDate createDate;
	private boolean status;
	private Set<ApplyListDTO> countActive = new HashSet<ApplyListDTO>();
}
