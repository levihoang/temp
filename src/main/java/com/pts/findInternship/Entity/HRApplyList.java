package com.pts.findInternship.Entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
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
@Entity
@Table(name = "HRApplyList")
public class HRApplyList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "DemandId")
	private DemandUni demandUni;
	@ManyToOne
	@JoinColumn(name = "HrId")
	private HR hr;
	@Column(name = "date",columnDefinition = "DATE")
	private LocalDate date;
	private String status;
	@Column(name = "note",columnDefinition = "NVARCHAR(255)")
	private String note;
}
