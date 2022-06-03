package com.r2s.findInternship.Entity;

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
@Table(name = "Rate")
public class Rate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "username")
	private User user;
	@ManyToOne
	@JoinColumn(name = "CompanyId")
	private Company company;
	@Column(name = "score",columnDefinition = "INT(6)")
	private int score;
	@Column(name = "comment",columnDefinition = "NVARCHAR(255)")
	private String comment;
	@Column(name = "create_Date",columnDefinition = "DATE")
	private LocalDate createDate;
	
}
