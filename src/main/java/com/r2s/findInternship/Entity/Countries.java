package com.r2s.findInternship.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "countries")
public class Countries implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name",length = 50)
	private String name;
	@Column(name = "AreaCode",length = 50)
	private String areaCode;
	@Column(name = "CreateDate",columnDefinition = "DATE")
	private LocalDate createDate;
	@OneToMany(mappedBy = "country",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Collection<Province> provinces = new HashSet<Province>();
}
