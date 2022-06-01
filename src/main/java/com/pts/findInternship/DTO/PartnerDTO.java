package com.pts.findInternship.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class PartnerDTO {

	private int id;
	private String position;
	private UserDTO user;
}
