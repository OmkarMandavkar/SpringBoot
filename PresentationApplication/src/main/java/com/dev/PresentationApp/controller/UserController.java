package com.dev.PresentationApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.PresentationApp.dto.UserRequest;
import com.dev.PresentationApp.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody UserRequest	userRequest) {

		boolean registered = userService.userRegister(userRequest);
		
		if(registered) {
			return new ResponseEntity<String>("User Registered Succefully", HttpStatus.CREATED);
		}
		return ResponseEntity.badRequest().body("Already Registered");
	}
	
	
}
