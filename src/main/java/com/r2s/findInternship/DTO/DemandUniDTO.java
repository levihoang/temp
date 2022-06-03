package com.r2s.findInternship.DTO;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
