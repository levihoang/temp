package com.r2s.findInternship.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r2s.findInternship.DTO.MajorDTO;
import com.r2s.findInternship.Service.MajorService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/major")
public class MajorController {
	@Autowired
	private MajorService majorService;
	
	@GetMapping("")
	public ResponseEntity<List<MajorDTO>> getAll()
	{
		return ResponseEntity.ok(this.majorService.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<MajorDTO> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(this.majorService.findById(id));
	}
	@PostMapping("")
	public ResponseEntity<MajorDTO> create(@RequestBody MajorDTO dto)
	{	
		return ResponseEntity.ok(this.majorService.save(dto));
	}
	@PutMapping("/{id}")
	public ResponseEntity<MajorDTO> update(@PathVariable int id, @RequestBody MajorDTO dto)
	{
		return ResponseEntity.ok(this.majorService.update(id, dto));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable int id)
	{
		this.majorService.deleteById(id);
		return ResponseEntity.ok("DELETED");
	}
}
