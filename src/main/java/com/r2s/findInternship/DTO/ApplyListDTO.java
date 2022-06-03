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
public class ApplyListDTO {
	private int id;
	private JobDTO jobApp;
	private CandidateDTO candidate;
	private LocalDate createDate;
	private String status;
	private String note;
}
