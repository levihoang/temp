package com.pts.findInternship.DTO;



import java.time.LocalDate;

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
