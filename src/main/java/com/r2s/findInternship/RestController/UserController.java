package com.r2s.findInternship.RestController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.r2s.findInternship.DTO.UserCreationDTO;
import com.r2s.findInternship.DTO.UserDTO;
import com.r2s.findInternship.Service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("user")
	public UserDTO createUser(@Valid @RequestBody UserCreationDTO dto)
	{
		return  this.userService.save(dto);
	}
//	@PutMapping("user")
//	public UserDTO updateUser(@RequestBody UserDTO dto, @RequestParam("q") String username)
//	{
//		User u = this.userRepository.findByUsername(username);
//		String pass = u.getPassword();
//		if(u!= null)
//		{
//			u = this.mapperUser.mapUser(dto);
//			u.setUsername(username);
//			u.setPassword(pass);
//			this.userRepository.save(u);
//			return this.mapperUser.mapUser(u);
//		}
//		return null;
//		
//	}
}
