package com.openbanking.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Authrorize {
	
	private String responseType;
	private String client_id;
	private String redirect_uri;
	private String scope;
	private String client_info;
	private String state;
	private String auth_type;
	private String lang;
	private String cellphone_cert_yn;
	private String authorized_cert_yn;
	private String account_hold_auth_yn;

}
