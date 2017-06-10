package com.hackathon.scalitimes.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.scalitimes.domains.models.Role;
import com.hackathon.scalitimes.service.RoleService;
import com.hackathon.scalitimes.util.Constants;

@RestController
@RequestMapping(Constants.Config.PATH_V1 + "roles")
@CrossOrigin
public class RoleController {

	@Autowired
	private RoleService roleService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Role>> list() {
		List<Role> roles = roleService.list();

		return ResponseEntity.status(HttpStatus.OK).body(roles);
	}

	@RequestMapping(method = RequestMethod.GET, params = "name")
	public ResponseEntity<List<Role>> listByName(@RequestParam(value = "name") String name) {
		List<Role> roles = roleService.listByName(name);

		return ResponseEntity.status(HttpStatus.OK).body(roles);
	}

	@RequestMapping(method = RequestMethod.DELETE, params = { "id" })
	public ResponseEntity<String> deleteRole(@RequestParam(value = "id") Long id) {
		roleService.delete(id);

		return ResponseEntity.status(HttpStatus.OK).body("Regra excluida com sucesso!");
	}

}
