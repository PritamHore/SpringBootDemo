package com.pritam.app.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Component
@Table(name = "user")
@Getter
@Setter
@ToString
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "u_id", nullable = false)
	private Integer id;
	
	@Column(name = "u_first_name", nullable = false)
	private String firstName;
	
	@Column(name = "u_last_name", nullable = false)
	private String lastName;
	
	@Column(name = "u_email", nullable = false)
	private String email;
	
	@Column(name = "u_mobile", nullable = false)
	private Long mobile;
	
	@Column(name = "u_created_on", nullable = false)
	private Date createdOn;
	
	@Column(name = "user-role", nullable = false)
	private byte role; 
//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(
//			name = "user_role_map",
//			joinColumns = @JoinColumn(name = "user_id", nullable = false),
//			inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false)
//			)
//	private Set<MasterRole> role = new HashSet<>(); 
	
}
