package com.pts.findInternship.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pts.findInternship.DTO.JobDTO;
import com.pts.findInternship.Entity.Job;
@Repository
public interface JobRepository extends JpaRepository<Job, Integer>  {
	List<Job> findByNameContaining(String name);
}
