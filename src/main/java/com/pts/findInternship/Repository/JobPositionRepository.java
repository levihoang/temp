package com.pts.findInternship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pts.findInternship.Entity.JobPosition;
@Repository
public interface JobPositionRepository extends JpaRepository<JobPosition, Integer> {
	boolean existsByName(String name);
}
