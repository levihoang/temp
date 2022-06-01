package com.pts.findInternship.Entity;

import java.util.Date;

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
	private String requirement;
	private String ortherInfo;
	private Date start;
	private Date end;
	private String students;
	private Date createDate;
	private boolean status;
}
