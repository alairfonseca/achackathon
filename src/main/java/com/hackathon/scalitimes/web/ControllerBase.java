package com.hackathon.scalitimes.web;

import java.io.UnsupportedEncodingException;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.hackathon.scalitimes.util.Constants;

public class ControllerBase {
	
	protected String generateToken(String userName, int profileId){
		String token = "";
		
		try {
		    Algorithm algorithm = Algorithm.HMAC256(Constants.Keys.SECRET_KEY);
		    token = JWT.create()
		        .withIssuer(Constants.Keys.ISSUER_KEY)
		        .withClaim(Constants.Keys.PROFILE_ID_KEY, profileId)
		        .sign(algorithm);
		} catch (UnsupportedEncodingException exception){
		    //UTF-8 encoding not supported
		} catch (JWTCreationException exception){
		    //Invalid Signing configuration / Couldn't convert Claims.
		}
		
		return token;
	}

}
