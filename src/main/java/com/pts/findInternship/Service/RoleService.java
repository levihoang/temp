package com.pts.findInternship.Service;

import java.util.List;
import java.util.Optional;

import com.pts.findInternship.Entity.Role;

public interface RoleService {

	boolean existsByName(String name);

	Role getById(Integer id);

	Optional<Role> findById(Integer id);

	List<Role> findAll();

	<S extends Role> S save(S entity);

}
