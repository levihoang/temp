package com.r2s.findInternship.DTO;

import com.r2s.findInternship.Entity.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCreationDTO {
	private String username;
	private String password;
	private String confirmPassword;
	private Role role;
}
