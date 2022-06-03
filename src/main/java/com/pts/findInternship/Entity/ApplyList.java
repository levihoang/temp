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
@Table(name = "ApplyList")
public class ApplyList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "JobId")
	private Job jobApp;
	@ManyToOne
	@JoinColumn(name = "CandidateId")
	private Candidate candidate;
	@Column(name = "create_date",columnDefinition = "DATE")
	private LocalDate createDate;
	private String status;
	@Column(name = "note",columnDefinition = "NVARCHAR(250)")
	private String note;
}
