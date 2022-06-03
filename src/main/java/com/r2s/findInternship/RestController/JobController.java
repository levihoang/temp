package com.r2s.findInternship.RestController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.r2s.findInternship.DTO.JobDTO;
import com.r2s.findInternship.Service.JobService;

@RestController
@RequestMapping("api/job")
public class JobController {
	@Autowired
	private JobService jobService;
	//GET ALL
	@GetMapping("")
	public ResponseEntity<?> getAll()
	{
		return ResponseEntity.ok(jobService.findAll());
	}
	//GET BY ID
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(this.jobService.findById(id));
	}
	//CREATE 
	@PostMapping("")
	public ResponseEntity<?> create(@RequestBody JobDTO dto)
	{
		return ResponseEntity.ok(this.jobService.save(dto));
	}
	//UPDATE BY ID
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody JobDTO dto, @PathVariable int id)
	{
		return ResponseEntity.ok(this.jobService.update(id, dto));
	}
	//DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable int id)
	{
		this.jobService.deleteById(id);
		return ResponseEntity.ok("DELETED");
	}
	//SEARCH WITH NameJob...
	@GetMapping("/search")
	public ResponseEntity<?> searchName(@RequestParam Map<String, String> params)
	{
		String kw = params.get("q");
		
		return ResponseEntity.ok(this.jobService.findByNameContaining(kw));
	}
	
}
