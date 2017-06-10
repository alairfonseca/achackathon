package com.hackathon.scalitimes.domains.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.scalitimes.domains.models.Role;

/**
 * 
 * @author filhoalf
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

	List<Role> findByNameContaining(String name);
	
}
