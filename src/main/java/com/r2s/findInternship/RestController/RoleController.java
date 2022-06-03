package com.r2s.findInternship.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r2s.findInternship.Entity.Role;
import com.r2s.findInternship.Service.RoleService;

@RestController
@RequestMapping("api/role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	@GetMapping("")
	public ResponseEntity<?> getAll()
	{
		return ResponseEntity.ok(this.roleService.findAll());
	}
	@PostMapping("")
	public ResponseEntity<Role> create(@RequestBody Role role)
	{
		return ResponseEntity.ok(this.roleService.save(role));
	}
}
