package com.hackathon.scalitimes.domains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.scalitimes.domains.models.Role;

/**
 * 
 * @author filhoalf
 *
 */
public interface ProfileRepository extends JpaRepository<Role, Long> {

	
	
}
