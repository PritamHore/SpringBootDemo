package com.pritam.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.app.dto.GlobalResDto;
import com.pritam.app.dto.UserDto;
import com.pritam.app.entity.UserEntity;
import com.pritam.app.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired 
	private UserService userService;
	
	@PostMapping(value = "/create")
	public ResponseEntity<GlobalResDto> createUser(@RequestBody UserDto	 userDto){
		int id = userService.createUser(userDto);
		return ResponseEntity.ok(new GlobalResDto(id,"User Created Successfully."));
	}
	
	@GetMapping(value = "/users")
	public ResponseEntity<List<UserEntity>> fetchUsers() {
		return ResponseEntity.ok(userService.fetchAllUsers());
	}
	
	@GetMapping(value = "/user/{id}")
	public ResponseEntity<Optional<UserEntity>> fetchUserById(@PathVariable("id") Integer id) {
	
		return ResponseEntity.ok(userService.fetchUserById(id));
	}
	
}
