package com.hackathon.scalitimes.domains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.scalitimes.domains.models.User;

/**
 * 
 * @author filhoalf
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
