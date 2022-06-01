package com.pts.findInternship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pts.findInternship.Entity.Candidate;
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
