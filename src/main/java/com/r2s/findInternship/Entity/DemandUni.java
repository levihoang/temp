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
@Table(name = "DemandUni")
public class DemandUni {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	//1part co nhieu demand
	@ManyToOne
	@JoinColumn(name = "PartnerId")
	private Partner partner;
	@ManyToOne
	@JoinColumn(name = "MajorId")
	private Major major;
	private String desciption;
	@ManyToOne
	@JoinColumn(name = "PositionId")
	private JobPosition position;
	@Column(name = "requirement",columnDefinition = "NVARCHAR(500)",nullable = true)
	private String requirement;
	@Column(name = "other_info",columnDefinition = "NVARCHAR(500)")
	private String ortherInfo;
	@Column(name = "start",columnDefinition = "DATE")
	private Date start;
	@Column(name = "end",columnDefinition = "DATE")
	private Date end;
	private String students;
	@Column(name = "create_date",columnDefinition = "DATE")
	private LocalDate createDate;
	private boolean status;
}
