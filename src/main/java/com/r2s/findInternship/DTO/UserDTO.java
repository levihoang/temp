package com.r2s.findInternship.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import com.r2s.findInternship.Entity.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDTO {
	public static final String notAvilable = "Not avilable";
	public static final String active = "Active";
	public static final String lock = "Lock";
	public static final String disable = "Disable";
	@Size(min = 6,max = 12,message = "{error.usernameRequire}")
	@NotEmpty(message = "{error.usernameNotNull}")
	private String username;
	private int gender;
	private String avatar;
	private String phone;
	private String firstName;
	private String lastName;
	@Email(message = "{error.emailFormat}")
	@NotEmpty(message = "{error.emailNotNull}")
	private String email;
	private String status;
	private Role role;
	private MultipartFile fileAvatar;
}
