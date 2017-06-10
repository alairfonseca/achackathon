package com.hackathon.scalitimes.domains.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.scalitimes.domains.models.User;

/**
 * 
 * @author filhoalf
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findByNameContaining(String name);
	
	User findByEmail(String name);
	
}
