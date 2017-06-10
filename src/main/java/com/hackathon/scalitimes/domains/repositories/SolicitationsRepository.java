package com.hackathon.scalitimes.domains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.scalitimes.domains.models.Solicitations;

/**
 * 
 * @author filhoalf
 *
 */
public interface SolicitationsRepository extends JpaRepository<Solicitations, Long> {

	
	
}
