package com.r2s.findInternship.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.r2s.findInternship.Entity.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCreationDTO extends UserDTO {

	@Size(min = 6,max = 12,message = "{error.passwordRequire}")
	@NotEmpty(message = "{error.passwordNotNull}")
	private String password;
	private String confirmPassword;
}
