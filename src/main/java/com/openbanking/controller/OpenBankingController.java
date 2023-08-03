package com.openbanking.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.openbanking.dto.Authorize;
import com.openbanking.service.OpenBankingService;

import lombok.RequiredArgsConstructor;

@RestController
@EnableFeignClients
@RequiredArgsConstructor
public class OpenBankingController {
	
	@Value("${openbanking.client_id}")
	private String client_id;
	@Value("${openbanking.client_secret}")
	private String client_secret;
	@Value("${openbanking.redirect_uri}")
	private String redirect_uri;
	private final static String grant_type = "authorization_code";
	
	private final OpenBankingService bankingService;
	
	@GetMapping("/authResult")
	@ResponseBody
	public String authResult(String code, String client_info) throws IOException {
		
		Authorize authorize = new Authorize(code, client_id, client_secret, redirect_uri, grant_type);
		bankingService.getToken(authorize);
		
		return code;
	}
}
