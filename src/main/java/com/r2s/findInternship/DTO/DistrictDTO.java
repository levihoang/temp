package com.r2s.findInternship.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DistrictDTO {
	private int id;
	private String name;
	private String prefix;
	private ProvinceDTO provinceDTO;
}
