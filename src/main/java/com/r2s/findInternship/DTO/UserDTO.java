package com.r2s.findInternship.DTO;

import org.springframework.web.multipart.MultipartFile;

import com.r2s.findInternship.Entity.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDTO {
	private String username;
	private boolean gender;
	private String avatar;
	private String phone;
	private String firstName;
	private String lastName;
	private String email;
	private String status;
	private Role role;
	private MultipartFile fileAvatar;
}
