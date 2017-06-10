package com.hackathon.scalitimes.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.scalitimes.dto.DtoLogin;
import com.hackathon.scalitimes.util.Constants;


@RestController
@RequestMapping(Constants.Config.PATH_V1 + "auth")
public class LoginController extends ControllerBase {

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<DtoLogin> login(@RequestParam (value="user") String user, @RequestParam (value="password") String password) {
		
		DtoLogin dtoLogin = new DtoLogin();
		
		dtoLogin.setToken(generateToken(dtoLogin.getUserName(), 31, 32));
		
		Integer profileId = decipherToken(dtoLogin.getToken(), Constants.Keys.PROFILE_ID_KEY, Integer.class);
	
		return ResponseEntity.status(HttpStatus.OK).body(dtoLogin);
	}
}
