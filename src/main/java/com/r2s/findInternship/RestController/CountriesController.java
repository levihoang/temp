package com.r2s.findInternship.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r2s.findInternship.DTO.CountriesDTO;
import com.r2s.findInternship.Service.CountriesService;

@RestController
@RequestMapping("api/country")
public class CountriesController {
	@Autowired 
	private CountriesService countriesService;
	
	@GetMapping("")
	public ResponseEntity<List<CountriesDTO>> getAll()
	{
		return ResponseEntity.ok(this.countriesService.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<CountriesDTO> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(this.countriesService.findById(id));
	}
}
