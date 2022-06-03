package com.r2s.findInternship.DTO;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class PartnerDTO {
	private String position;
	private UserDTO user;
	private Set<DemandUniDTO> demandUni;
}
