package com.hackathon.scalitimes.web;

import java.io.UnsupportedEncodingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

@RestController
public class LoginController extends ControllerBase {
	@RequestMapping("/auth")
	public String auth(@RequestParam (value="user") String user, @RequestParam (value="password") String password) {
		String token = "";
		
		try {
		    Algorithm algorithm = Algorithm.HMAC256("h4ck4thon");
		    token = JWT.create()
		        .withIssuer("user")
		        .sign(algorithm);
		} catch (UnsupportedEncodingException exception){
		    //UTF-8 encoding not supported
		} catch (JWTCreationException exception){
		    //Invalid Signing configuration / Couldn't convert Claims.
		}
		
		return token;
	}
}
