package com.r2s.findInternship.Entity;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
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
@Table(name = "Major")
public class Major {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",columnDefinition = "INT(10)")
	private int id;
	@Column(name = "name",columnDefinition = "NVARCHAR(200) NOT NULL")
	private String name;
	@Column(name = "create_date",columnDefinition = "DATE")
	private LocalDate createDate;
//	@OneToMany(mappedBy = "major",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	@JsonManagedReference(value = "job-major")
//	private Collection<Job> jobs = new HashSet<Job>();
}
