package com.openbanking.controller;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@EnableFeignClients
@RequiredArgsConstructor
public class OpenBankingController {
	
//	private final OpenBankingService bankingService;
	@GetMapping("/authResult")
	@ResponseBody
	public String authResult(String code, String client_info) {
		return code;
	}
}
