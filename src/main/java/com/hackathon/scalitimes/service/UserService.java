package com.hackathon.scalitimes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.scalitimes.domains.models.User;
import com.hackathon.scalitimes.domains.repositories.UserRepository;

/**
 * 
 * @author filhoalf
 *
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> list() {
		return userRepository.findAll();
	}

	public List<User> listByName(String name) {
		return userRepository.findByNameContaining(name);
	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public User findByLogin(String login) {
		return userRepository.findByLogin(login);
	}

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public void deleteUser(Long id) {
		userRepository.delete(id);
	}

	public User findById(Long id) {
		return userRepository.findById(id);
	}

}
