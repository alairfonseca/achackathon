package com.hackathon.scalitimes.domains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.scalitimes.domains.models.Profile;

/**
 * 
 * @author filhoalf
 *
 */
public interface ProfileRepository extends JpaRepository<Profile, Long> {

	
	
}
