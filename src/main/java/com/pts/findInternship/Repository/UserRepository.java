package com.pts.findInternship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pts.findInternship.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
