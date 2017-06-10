package com.hackathon.scalitimes.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController extends ControllerBase {
	@RequestMapping("/auth")
	public String auth(@RequestParam (value="user") String user, @RequestParam (value="password") String password) {
		
		return generateToken(user, 1);
		
	}
}
