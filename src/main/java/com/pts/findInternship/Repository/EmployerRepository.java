package com.pts.findInternship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pts.findInternship.Entity.Company;
@Repository
public interface EmployerRepository extends JpaRepository<Company, Integer> {

}
