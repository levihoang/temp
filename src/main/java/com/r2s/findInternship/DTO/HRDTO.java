package com.r2s.findInternship.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class HRDTO {
	private int id;
	private UserDTO user;
	private String position;
	private CompanyDTO company;
}
