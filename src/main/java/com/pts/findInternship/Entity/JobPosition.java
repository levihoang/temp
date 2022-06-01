package com.pts.findInternship.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "JobPosition")
public class JobPosition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(mappedBy = "position",fetch = FetchType.LAZY)
	private Set<DemandUni> demandUnis = new HashSet<DemandUni>();
	@OneToMany(mappedBy = "jobposition",fetch = FetchType.LAZY)
	private Set<Job> jobs = new HashSet<Job>();
}
