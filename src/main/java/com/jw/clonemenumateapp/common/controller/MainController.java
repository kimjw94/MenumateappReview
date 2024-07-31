package com.jw.clonemenumateapp.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/api")
	public String mainPage() {
		return "index.html";
	}

}
