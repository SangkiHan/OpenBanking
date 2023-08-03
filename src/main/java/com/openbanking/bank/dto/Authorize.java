package com.openbanking.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Authorize {
	
	private String code;
	private String client_id;
	private String client_secret;
	private String redirect_uri;
	private String grant_type;

}
