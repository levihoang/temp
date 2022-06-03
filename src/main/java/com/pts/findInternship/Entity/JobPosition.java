package com.pts.findInternship.Entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	@Column(name = "name",columnDefinition = "VARCHAR(100)")
	private String name;
	@OneToMany(mappedBy = "position",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<DemandUni> demandUnis = new HashSet<DemandUni>();
	@OneToMany(mappedBy = "jobposition",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonManagedReference(value = "job-jobposition")
	private Collection<Job> jobs = new HashSet<Job>();
}
