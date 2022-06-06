package com.r2s.findInternship.DTO;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

import com.r2s.findInternship.Entity.Province;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CountriesDTO {
	private int id;
	private String name;
	private String areaCode;
	private LocalDate createDate;
	private Collection<Province> provinces = new HashSet<Province>();
}