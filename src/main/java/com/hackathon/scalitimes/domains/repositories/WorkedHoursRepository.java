package com.hackathon.scalitimes.domains.repositories;

import com.hackathon.scalitimes.domains.models.WorkedHours;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author filhoalf
 *
 */
public interface WorkedHoursRepository extends JpaRepository<WorkedHours, Long> {

	
	
}
