package com.hackathon.scalitimes.domains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.scalitimes.domains.models.PlaceRule;

/**
 * 
 * @author filhoalf
 *
 */
public interface PlaceRulesRepository extends JpaRepository<PlaceRule, Integer> {

}
