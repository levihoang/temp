package com.r2s.findInternship.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r2s.findInternship.DTO.LocationDTO;
import com.r2s.findInternship.Entity.Location;
import com.r2s.findInternship.Service.LocationService;

@RestController
@RequestMapping("api/location")
public class LocationController {
	@Autowired
	private LocationService locationService;

	@PostMapping("")
	public ResponseEntity<Location> create(@RequestBody Location entity) {
		return ResponseEntity.ok(this.locationService.save(entity));
	}
	@GetMapping("/{id}")
	public ResponseEntity<Location> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(this.locationService.findById(id));
	}
	@GetMapping("")
	public ResponseEntity<List<Location>> getAll()
	{
		return ResponseEntity.ok(locationService.findAll());
	}
}
