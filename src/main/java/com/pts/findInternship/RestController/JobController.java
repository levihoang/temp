package com.pts.findInternship.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pts.findInternship.DTO.JobDTO;
import com.pts.findInternship.Service.JobService;

@RestController
@RequestMapping("api/job")
public class JobController {
	@Autowired
	private JobService jobService;
	@GetMapping("")
	public ResponseEntity<?> getAll()
	{
		return ResponseEntity.ok(jobService.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(this.jobService.findById(id));
	}
	@PostMapping("")
	public ResponseEntity<?> create(@RequestBody JobDTO dto)
	{
		return ResponseEntity.ok(this.jobService.save(dto));
	}
}
