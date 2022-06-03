package com.pts.findInternship.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "Candidate")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "CV",columnDefinition = "VARCHAR(100)")
	private String CV;
	@OneToOne
	@JoinColumn(name = "username")
	private User user;
	@OneToOne
	@JoinColumn(name = "MajorId")
	private Major major;
	
	@OneToMany(mappedBy = "candidateCare",cascade = CascadeType.ALL)
	private Set<CareList> careJobs = new HashSet<CareList>();
	
}
