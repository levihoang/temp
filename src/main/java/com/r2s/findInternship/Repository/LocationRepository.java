package com.r2s.findInternship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.r2s.findInternship.Entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
