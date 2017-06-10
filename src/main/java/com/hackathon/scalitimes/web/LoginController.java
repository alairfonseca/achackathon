package com.hackathon.scalitimes.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.scalitimes.domains.models.User;
import com.hackathon.scalitimes.dto.DtoLogin;
import com.hackathon.scalitimes.exception.UserNotFoundException;
import com.hackathon.scalitimes.service.UserService;
import com.hackathon.scalitimes.util.Constants;
import com.hackathon.scalitimes.util.TokenUtil;


@RestController
@RequestMapping(Constants.Config.PATH_V1 + "auth")
public class LoginController extends ControllerBase {
	
	@Autowired
	UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<DtoLogin> login(@RequestParam (value="user") String userLogin, @RequestParam (value="password") String password) throws UserNotFoundException {
		
		User user = userService.findByLogin(userLogin);
		DtoLogin dtoLogin = new DtoLogin();
		
		if(user == null)
			throw new UserNotFoundException();
		
		dtoLogin.setToken(TokenUtil.generateToken(dtoLogin.getUserName(), 31, 32));
		
		Integer profileId = TokenUtil.decipherToken(dtoLogin.getToken(), Constants.Keys.PROFILE_ID_KEY, Integer.class);
	
		return ResponseEntity.status(HttpStatus.OK).body(dtoLogin);
	}
}
