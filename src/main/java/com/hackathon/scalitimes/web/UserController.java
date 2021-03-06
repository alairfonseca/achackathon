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

import com.hackathon.scalitimes.domains.models.User;
import com.hackathon.scalitimes.service.UserService;
import com.hackathon.scalitimes.util.Constants;

/**
 * 
 * @author filhoalf
 *
 */
@RestController
@RequestMapping(Constants.Config.PATH_V1 + "users")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> list() {
		List<User> users = userService.list();

		return ResponseEntity.status(HttpStatus.OK).body(users);
	}

	@RequestMapping(method = RequestMethod.GET, params = { "name" })
	public ResponseEntity<List<User>> listByName(@RequestParam(value = "name") String name) {
		List<User> users = userService.listByName(name);

		return ResponseEntity.status(HttpStatus.OK).body(users);
	}

	@RequestMapping(method = RequestMethod.GET, params = { "email" })
	public ResponseEntity<User> findByEmail(@RequestParam(value = "email") String email) {
		User user = userService.findByEmail(email);

		return ResponseEntity.status(HttpStatus.OK).body(user);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/new")
	public ResponseEntity<String> createUser(@Valid @RequestBody User user) {

		user = userService.createUser(user);

		String message = "OK!";

		return ResponseEntity.status(HttpStatus.OK).body(message);
	}

	@RequestMapping(method = RequestMethod.DELETE, params = { "id" })
	public ResponseEntity<String> deleteUser(@RequestParam(value = "id") Long id) {
		userService.deleteUser(id);

		return ResponseEntity.status(HttpStatus.OK).body("Usuario excluido com sucesso!");
	}

}
