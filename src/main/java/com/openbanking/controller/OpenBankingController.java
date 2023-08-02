package com.openbanking.controller;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
public class OpenBankingController {
	
	@PostMapping("/authorize")
	public void authorize() {
		
	}

}
