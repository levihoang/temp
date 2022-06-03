package com.pts.findInternship.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pts.findInternship.Entity.Role;
import com.pts.findInternship.Exception.InternalServerErrorException;
import com.pts.findInternship.Repository.RoleRepository;
import com.pts.findInternship.Service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public <S extends Role> S save(S entity) {
		if(this.existsByName(entity.getName())) throw new InternalServerErrorException(String.format("Role is exists in my system wiht %s, so you cann't add it", entity.getName()));
		return roleRepository.save(entity);
	}

	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Optional<Role> findById(Integer id) {
		return roleRepository.findById(id);
	}

	@Override
	public Role getById(Integer id) {
		return roleRepository.getById(id);
	}

	@Override
	public boolean existsByName(String name) {
		return roleRepository.existsByName(name);
	}
	
}
