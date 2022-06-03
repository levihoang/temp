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
