package com.pritam.app.config;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import jakarta.ws.rs.client.ClientBuilder;

@Component
public class KeycloakConfig {
	
	@Value("${keycloak.auth-server-url}")
	private String keycloakURL;
	
	@Value("${keycloak.auth-server-user}")
	private String keycloakUser;
	
	@Value("${keycloak.auth-server-password}")
	private String keycloakPassword;
	
	@Value("${keycloak.auth-server-clientId}")
	private String keycloakClientId;
	
	@Bean
	Keycloak keycloakAdmin() {
		return KeycloakBuilder.builder()
				.serverUrl(keycloakURL)
				.grantType(OAuth2Constants.PASSWORD)
				.realm("master")
				.clientId("admin-cli")
				.username(keycloakUser)
				.password(keycloakPassword)
				.resteasyClient(((ResteasyClientBuilder) ClientBuilder.newBuilder()).connectionPoolSize(20).build()).build();
	}
	
	public RealmResource getRealm(String realm) {
		return this.keycloakAdmin().realm(realm);
	}

}
