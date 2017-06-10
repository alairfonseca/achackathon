package com.hackathon.scalitimes.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.scalitimes.domains.models.ProfileRule;
import com.hackathon.scalitimes.service.ProfileRuleService;
import com.hackathon.scalitimes.util.Constants;

@RestController
@RequestMapping(Constants.Config.PATH_V1 + "profile-rules")
@CrossOrigin
public class ProfileRuleController {

	@Autowired
	private ProfileRuleService profileRuleService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ProfileRule>> list() {
		List<ProfileRule> profileRules = profileRuleService.list();

		return ResponseEntity.status(HttpStatus.OK).body(profileRules);
	}

	@RequestMapping(method = RequestMethod.GET, params = { "name" })
	public ResponseEntity<List<ProfileRule>> list(@RequestParam(value = "name") String name) {
		List<ProfileRule> profileRules = profileRuleService.listByName(name);

		return ResponseEntity.status(HttpStatus.OK).body(profileRules);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/new")
	public ResponseEntity<String> createProfileRule(@Valid @RequestBody ProfileRule profileRule) {
		profileRule = profileRuleService.createProfileRule(profileRule);

		String message = "OK!";

		return ResponseEntity.status(HttpStatus.OK).body(message);
	}

	@RequestMapping(method = RequestMethod.DELETE, params = { "id" })
	public ResponseEntity<String> deleteUser(@RequestParam(value = "id") Long id) {
		profileRuleService.deleteProfileRule(id);

		return ResponseEntity.status(HttpStatus.OK).body("Regra de perfil excluida com sucesso!");
	}

}
