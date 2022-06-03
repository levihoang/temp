package com.pts.findInternship.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class DemandUniDTO {
	private int id;
	private String name;
	private PartnerDTO partner;
	private MajorDTO major;
	private String desciption;
	private JobPositionDTO position;
	private String requirement;
	private String ortherInfo;
	private LocalDate start;
	private LocalDate end;
	private String students;
	private LocalDate createDate;
	private boolean status;
}
