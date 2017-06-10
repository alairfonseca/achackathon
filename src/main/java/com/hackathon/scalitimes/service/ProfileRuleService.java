package com.hackathon.scalitimes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.scalitimes.domains.models.ProfileRule;
import com.hackathon.scalitimes.domains.repositories.ProfileRulesRepository;

@Service
public class ProfileRuleService {

	@Autowired
	private ProfileRulesRepository profileRulesRepository;

	public List<ProfileRule> list() {
		return profileRulesRepository.findAll();
	}

	public List<ProfileRule> listByName(String name) {
		return profileRulesRepository.findByNameContaining(name);
	}

	public ProfileRule createProfileRule(ProfileRule profileRule) {
		return profileRulesRepository.save(profileRule);
	}

	public void deleteProfileRule(Long id) {
		profileRulesRepository.delete(id);
	}

}
