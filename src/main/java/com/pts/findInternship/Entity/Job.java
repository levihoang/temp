package com.pts.findInternship.Entity;

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
	private JobPosition jobposition;
	private int amount;
	private long salaryMin;
	private long salaryMax;
	private String requirement;
	private String otherInfo;
	private Date timeStart;
	private Date timeEnd;
	@ManyToOne
	@JoinColumn(name = "LocationId")
	private Location locationjob;
	private Date createDate;
	private boolean status;
	//How many time Candidate click Apply
	@OneToMany(mappedBy = "jobApp")
	private Set<ApplyList> countActive = new HashSet<ApplyList>();
}
