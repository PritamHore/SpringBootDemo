package com.pritam.app.keycloak.service;

import java.util.List;

import com.pritam.app.dto.UserDto;

public interface KeycloakService {
	
	String createUser(UserDto userDto, List<String> defaultRole, String password);
	
	public void deleteUser(String keycloakUserId);
	
	public boolean logoutUser(String keycloakUserId);
}
