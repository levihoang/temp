package com.r2s.findInternship.RestController;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.r2s.findInternship.DTO.UserCreationDTO;
import com.r2s.findInternship.DTO.UserDTO;
import com.r2s.findInternship.Entity.User;
import com.r2s.findInternship.MapStructMapper.MapperUser;
import com.r2s.findInternship.Repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MapperUser mapperUser;
	@PostMapping("user")
	public UserDTO createUser(@RequestBody UserCreationDTO dto)
	{
		User u = this.mapperUser.mapUser(dto);
		u.setCreateDate(LocalDate.now());
		return  this.mapperUser.mapUser(userRepository.save(u));
	}
	@PutMapping("user")
	public UserDTO updateUser(@RequestBody UserDTO dto, @RequestParam("q") String username)
	{
		User u = this.userRepository.findByUsername(username);
		String pass = u.getPassword();
		if(u!= null)
		{
			u = this.mapperUser.mapUser(dto);
			u.setUsername(username);
			u.setPassword(pass);
			this.userRepository.save(u);
			return this.mapperUser.mapUser(u);
		}
		return null;
		
	}
}
