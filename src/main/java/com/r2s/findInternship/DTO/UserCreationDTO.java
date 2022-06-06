package com.r2s.findInternship.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.r2s.findInternship.Entity.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCreationDTO {
	@Size(min = 6,max = 12,message = "Username phai toi thieu 6 ky tu va nhieu nhat 12 ky tu")
	@NotEmpty(message = "Username khong duoc rong")
	private String username;
	@Size(min = 6,max = 12,message = "Password phai toi thieu 6 ky tu va nhieu nhat 12 ky tu")
	@NotEmpty(message = "Password khong duoc rong")
	private String password;
	private String confirmPassword;
	private Role role;
	@Email(message = "Email khong dung dinh dang")
	@NotEmpty(message = "email khong duoc rong")
	private String email;
}
