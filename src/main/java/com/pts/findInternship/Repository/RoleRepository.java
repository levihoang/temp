package com.pts.findInternship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pts.findInternship.Entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	boolean existsByName(String name);
}
