package com.hackathon.scalitimes.domains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.scalitimes.domains.models.WorkedHours;

/**
 * 
 * @author filhoalf
 *
 */
public interface WorkedHoursRepository extends JpaRepository<WorkedHours, Long> {

	
	
}
