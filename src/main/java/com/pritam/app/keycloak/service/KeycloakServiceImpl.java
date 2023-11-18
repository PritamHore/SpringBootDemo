package com.pritam.app.keycloak.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pritam.app.dto.UserDto;

@Service
public class KeycloakServiceImpl implements KeycloakService{

	@Override
	public String createUser(UserDto userDto, List<String> defaultRole, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String keycloakUserId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean logoutUser(String keycloakUserId) {
		// TODO Auto-generated method stub
		return false;
	}

}
