package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupControllers {
	
	@RequestMapping("/")
	public String HomePage() {
		System.out.println("hi");
		return "index";
	}

}
