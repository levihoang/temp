package com.pts.findInternship.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HRApplyListDTO {
	private int id;
	private DemandUniDTO demandUni;
	private HRDTO hr;
	private LocalDate date;
	private String status;
	private String note;
}
