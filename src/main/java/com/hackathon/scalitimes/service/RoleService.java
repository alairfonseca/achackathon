package com.hackathon.scalitimes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.scalitimes.domains.models.Role;
import com.hackathon.scalitimes.domains.repositories.RoleRepository;

@Service
public class RoleService {

	@Autowired
	RoleRepository roleRepository;

	public List<Role> list() {
		return roleRepository.findAll();
	}

	public List<Role> listByName(String name) {
		return roleRepository.findByNameContaining(name);
	}

	public Role createRole(Role role) {
		return roleRepository.save(role);
	}

	public void delete(Long id) {
		roleRepository.delete(id);
	}

}
