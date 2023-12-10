package com.pritam.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.app.dto.GlobalResDto;
import com.pritam.app.dto.MasterGetDto;
import com.pritam.app.service.MasterService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/master")
public class MasterController {
	
	@Autowired
	private MasterService masterService;
	
	@GetMapping(value = "/roles")
	private ResponseEntity<List<MasterGetDto>> getAllRoles() {
		return ResponseEntity.ok(masterService.getAllRoles());
	}
	
	@GetMapping(value = "roles/{name}")
	private ResponseEntity<MasterGetDto> getRolesById(@PathVariable("name") String name){
		return ResponseEntity.ok(masterService.getByName(name));
	}
	
	@PostMapping(value = "/roles")
	private ResponseEntity<GlobalResDto> addRole(@RequestBody @Valid MasterGetDto masterDto){
		return ResponseEntity.ok(masterService.createRole(masterDto));
	}

}
