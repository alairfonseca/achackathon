package com.hackathon.scalitimes.util;

import java.io.UnsupportedEncodingException;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

public class TokenUtil {
	
	public static String generateToken(String userName, int profileId, int userId){
		String token = "";
		
		try {
		    Algorithm algorithm = Algorithm.HMAC256(Constants.Keys.SECRET_KEY);
		    token = JWT.create()
		        .withIssuer(Constants.Config.ISSUER_ID)
		        .withClaim(Constants.Keys.PROFILE_ID_KEY, profileId)
		        .withClaim(Constants.Keys.USER_ID_KEY, userId)
		        .sign(algorithm);
		} catch (UnsupportedEncodingException exception){
		    //UTF-8 encoding not supported
		} catch (JWTCreationException exception){
		    //Invalid Signing configuration / Couldn't convert Claims.
		}
		
		return token;
	}
	
	
	public static <T> T decipherToken(String token, String claimKey, Class<T> type){
		
		DecodedJWT decodedJwt = null;
		
		try {
		    decodedJwt = JWT.decode(token);
		} catch (JWTDecodeException exception){
		    //Invalid token
		}
		
		Claim claim = decodedJwt.getClaim(claimKey);
		
		T objReturn = claim.as(type);
		
		
		return objReturn;
		
	}

}
