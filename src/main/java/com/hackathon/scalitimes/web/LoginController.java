package com.hackathon.scalitimes.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.scalitimes.util.Constants;


@RestController
@RequestMapping(Constants.Config)
public class LoginController extends ControllerBase {
	@RequestMapping("/auth")
	public String auth(@RequestParam (value="user") String user, @RequestParam (value="password") String password) {
		
		return generateToken(user, 1);
		
	}
	

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> listar() {
		List<User> users = userService.listar();
	
		return ResponseEntity.status(HttpStatus.OK).body(users);
	}
}
