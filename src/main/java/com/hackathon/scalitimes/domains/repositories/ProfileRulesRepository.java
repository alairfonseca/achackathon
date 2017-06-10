package com.hackathon.scalitimes.domains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.scalitimes.domains.models.ProfileRule;

/**
 * 
 * @author filhoalf
 *
 */
public interface ProfileRulesRepository extends JpaRepository<ProfileRule, Long> {

}
