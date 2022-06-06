package com.r2s.findInternship.DTO;

import java.util.Collection;
import java.util.HashSet;

import com.r2s.findInternship.Entity.District;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProvinceDTO {
	private int id;
	private String name;
	private String shortName;
	private Collection<District> districts = new HashSet<District>();
}
