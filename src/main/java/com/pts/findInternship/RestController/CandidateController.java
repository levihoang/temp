package com.pts.findInternship.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pts.findInternship.DTO.CandidateDTO;
import com.pts.findInternship.Service.CandidateService;

@RestController
@RequestMapping("api/student")
public class CandidateController {
	@Autowired
	private CandidateService studentService;
	
	//Get all student
	@GetMapping("")
	public ResponseEntity<List<CandidateDTO>> getAll(){
		return ResponseEntity.ok(this.studentService.findAll());
	}
	//Get student by Id
	@GetMapping("/{id}")
	public ResponseEntity<CandidateDTO> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(this.studentService.findById(id));
	}
	//Add student
	@PostMapping("")
	public ResponseEntity<CandidateDTO> createStudent(@RequestBody CandidateDTO studentDTO)
	{
		return ResponseEntity.ok(this.studentService.save(studentDTO));
	}
	//Update student
	@PutMapping("/{id}")
	public ResponseEntity<CandidateDTO> updateStudent(@RequestBody CandidateDTO studentDTO, @PathVariable int id )
	{
		return ResponseEntity.ok(this.studentService.update(studentDTO, id));
	}
	//Delete
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id)
	{
		return ResponseEntity.ok("Student deleted");
	}
	
}
