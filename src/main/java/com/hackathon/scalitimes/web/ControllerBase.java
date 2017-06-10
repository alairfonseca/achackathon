package com.hackathon.scalitimes.web;

import java.io.UnsupportedEncodingException;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
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
	
	
	protected <T> T decipherToken(String token, String claimKey, Class<T> type){
		
		DecodedJWT decodedJwt = null;
		
		try {
		    decodedJwt = JWT.decode(token);
		} catch (JWTDecodeException exception){
		    //Invalid token
		}
		
		//decodedJwt.
		
		Claim claim = decodedJwt.getClaim(claimKey);
		
		T objReturn = claim.as(type);
		
		/*String token = "";
		
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
		}*/
		
		return objReturn;
		
		//return token;
	}

}
