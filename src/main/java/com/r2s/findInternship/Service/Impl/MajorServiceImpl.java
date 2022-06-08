package com.r2s.findInternship.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.r2s.findInternship.DTO.MajorDTO;
import com.r2s.findInternship.Entity.Major;
import com.r2s.findInternship.Entity.Role;
import com.r2s.findInternship.Exception.InternalServerErrorException;
import com.r2s.findInternship.Exception.ResourceNotFound;
import com.r2s.findInternship.MapStructMapper.MapperMajor;
import com.r2s.findInternship.Repository.MajorRepository;
import com.r2s.findInternship.Service.MajorService;
@Service
public class MajorServiceImpl implements MajorService {
	@Autowired
	private MajorRepository majorRepository;
	@Autowired
	private MapperMajor mapper;

	@Override
	public  MajorDTO save(MajorDTO dto) {
		Major entity = this.mapper.mapMajor(dto);
		if(this.existsByName(entity.getName())) throw new InternalServerErrorException(String.format("Major is exists in my system wiht %s, so you cann't add it", entity.getName()));
		entity =  majorRepository.save(entity);
		
		return this.mapper.mapMajor(entity);
	}

	@Override
	public List<MajorDTO> findAll() {
		return majorRepository.findAll().stream().map(
			major -> this.mapper.mapMajor(major)	
				).collect(Collectors.toList());
				
	}

	public Page<Major> findAll(Pageable pageable) {
		return majorRepository.findAll(pageable);
	}

	public List<Major> findAll(Sort sort) {
		return majorRepository.findAll(sort);
	}

	public List<Major> findAllById(Iterable<Integer> ids) {
		return majorRepository.findAllById(ids);
	}

	@Override
	public MajorDTO findById(Integer id) {
		return this.mapper.mapMajor(this.getById(id));
	}

	public boolean existsById(Integer id) {
		return majorRepository.existsById(id);
	}

	@Override
	public void deleteById(Integer id) {
		if(this.getById(id)!= null)
			this.majorRepository.deleteById(id);
	}

	public void delete(Major entity) {
		majorRepository.delete(entity);
	}

	public <S extends Major> List<S> findAll(Example<S> example) {
		return majorRepository.findAll(example);
	}

	@Override
	public MajorDTO update(int id, MajorDTO dto) {
		Major entity = this.getById(id);
		entity.setName(dto.getName());
		if(this.existsByName(entity.getName())) throw new InternalServerErrorException(String.format("Major is exists in my system wiht %s, so you cann't add it", entity.getName()));
		return this.mapper.mapMajor(this.majorRepository.save(entity));
	}

	@Override
	public Major getById(Integer id) {

		return majorRepository.findById(id).orElseThrow(()-> new ResourceNotFound("Major","id",String.valueOf(id)));
	}

	public boolean existsByName(String name) {
		return majorRepository.existsByName(name);
	}
	
	

}
