package com.openbanking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	@GetMapping("/authorize")
	public String authorize() {
		return "AUTH";
	}

}
