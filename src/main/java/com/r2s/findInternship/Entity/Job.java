package com.r2s.findInternship.Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "job")
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "HrId")
	private HR hr;
	private String desciption;
	@ManyToOne
	@JoinColumn(name = "MajorId")
	private Major major;
	@ManyToOne
	@JoinColumn(name = "PositionId")
	@JsonBackReference(value = "job-jobposition")
	private JobPosition jobposition;
	private int amount;
	@Column(name = "salary_min",columnDefinition = "bigint")
	private long salaryMin;
	@Column(name = "salary_max",columnDefinition = "bigint")
	private long salaryMax;
	@Column(name = "requirement",columnDefinition = "NVARCHAR(500)",nullable = true)
	private String requirement;
	@Column(name = "other_info",columnDefinition = "NVARCHAR(500)")
	private String otherInfo;
	@Column(name = "time_start",columnDefinition = "DATE")
	private LocalDate timeStart;
	@Column(name = "time_end",columnDefinition = "DATE")
	private LocalDate timeEnd;//	localDate
	@ManyToOne
	@JoinColumn(name = "LocationId")
	private Location locationjob;
	@Column(name = "create_Date",columnDefinition = "DATE")
	private LocalDate createDate;
	private boolean status;
	//How many time Candidate click Apply
	@OneToMany(mappedBy = "jobApp",cascade = CascadeType.ALL)
	private Set<ApplyList> countActive = new HashSet<ApplyList>();
}
