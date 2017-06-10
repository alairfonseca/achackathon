package com.hackathon.scalitimes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoLogin extends DtoBase{
		
	private String token;
	private String userName;
	private String email;
	
}
