package com.pritam.app.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "User")
@Getter
@Setter
@ToString
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user-id", nullable = false)
	private Integer id;
	
	@Column(name = "user-first-name", nullable = false)
	private String firstName;
	
	@Column(name = "user-last-name", nullable = false)
	private String lastName;
	
	@Column(name = "user-email", nullable = false)
	private String email;
	
	@Column(name = "user-mobile", nullable = false)
	private Long mobile;
	
	@Column(name = "user-created-on", nullable = false)
	private Date createdOn;
	
	@Column(name = "user-role", nullable = false)
	private byte role; 
	
}
