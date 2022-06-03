package com.pts.findInternship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pts.findInternship.Entity.Major;
@Repository
public interface MajorRepository extends JpaRepository<Major, Integer> {
	boolean existsByName(String name);
}
