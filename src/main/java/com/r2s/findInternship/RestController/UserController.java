package com.r2s.findInternship.RestController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r2s.findInternship.DTO.UserCreationDTO;
import com.r2s.findInternship.DTO.UserDTO;
import com.r2s.findInternship.Service.UserService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("")
	public UserDTO createUser(@Valid @RequestBody UserCreationDTO dto)
	{
		return  this.userService.handlerValid(dto);
	}
	@PutMapping("")
	public ResponseEntity<UserDTO> updateUser(@Valid @RequestBody UserCreationDTO dto)
	{
		return ResponseEntity.ok(this.userService.update(dto));
	}
	
}
