package com.r2s.findInternship.Service;

import java.util.List;

import com.r2s.findInternship.DTO.MajorDTO;
import com.r2s.findInternship.Entity.Major;

public interface MajorService {

	MajorDTO findById(Integer id);

	List<MajorDTO> findAll();

	MajorDTO save(MajorDTO dto);
	
	MajorDTO update(int id, MajorDTO dto);
	
	Major getById(Integer id);

	void deleteById(Integer id);

}
