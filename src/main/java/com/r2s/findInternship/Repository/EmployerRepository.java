package com.r2s.findInternship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.r2s.findInternship.Entity.Company;
@Repository
public interface EmployerRepository extends JpaRepository<Company, Integer> {

}
