package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// local host 8080 /Player

@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping("")
	public String MainApp() {
		
		return "home";
	}
	/*
	@RequestMapping("/login")
	public String loginProcess() {
		
		return "/home";
	}
	*/
	
}
