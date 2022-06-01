package com.pts.findInternship.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "HR")
public class HR {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private User user;
	private String position;
}
