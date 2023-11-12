package com.pritam.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.app.dto.GlobalResDto;
import com.pritam.app.dto.UserDto;
import com.pritam.app.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired 
	private UserService userService;
	
	@PostMapping(value = "/create")
	public GlobalResDto createUser(@RequestBody UserDto	 userDto){
		System.out.println("00");
		int id = userService.createUser(userDto);
		System.out.println("01");
		return new GlobalResDto(id,"User Created Successfully.");
		
	}
	
	@GetMapping(value = "/hi")
	public void hi() {
		System.out.println("hi");
	}
	
}
