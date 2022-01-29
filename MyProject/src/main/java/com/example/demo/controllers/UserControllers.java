package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.UserEntity;
import com.example.demo.services.UserServices;

@Controller
public class UserControllers {
	
	@Autowired
	UserServices userService;
	
	@RequestMapping("/")
	public String HomePage() {
		System.out.println("hi");
		return "userRegistration";
	}

	
	@PostMapping("/userSignup")
	public String UserSignup(UserEntity userEntity) {
		System.out.println("hiiiii"+userEntity.getNames());
		userService.saveUserDetails(userEntity);
		return "index";
	}
}
