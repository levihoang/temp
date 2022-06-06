package com.r2s.findInternship.Service;

import java.util.List;
import java.util.Optional;

import com.r2s.findInternship.Entity.Role;

public interface RoleService {

	boolean existsByName(String name);

	Role getById(Integer id);

	Optional<Role> findById(Integer id);

	List<Role> findAll();

	<S extends Role> S save(S entity);
	
	Role findByName(String name);

}
