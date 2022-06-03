package com.r2s.findInternship.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.r2s.findInternship.DTO.JobDTO;
import com.r2s.findInternship.Entity.Job;
@Repository
public interface JobRepository extends JpaRepository<Job, Integer>  {
	List<Job> findByNameContaining(String name);
}
