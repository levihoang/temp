package com.pts.findInternship.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pts.findInternship.Entity.JobPosition;
import com.pts.findInternship.Entity.Role;
import com.pts.findInternship.Service.JobPositionService;
import com.pts.findInternship.Service.RoleService;

@RestController
@RequestMapping("api/JobPosition")
public class JobPositionController {
	@Autowired
	private JobPositionService jobPositionService;
	@GetMapping("")
	public ResponseEntity<List<JobPosition>> getAll()
	{
		return ResponseEntity.ok(this.jobPositionService.findAll());
	}
	@PostMapping("")
	public ResponseEntity<JobPosition> create(@RequestBody JobPosition jobPosition)
	{
		return ResponseEntity.ok(this.jobPositionService.save(jobPosition));
	}
}
