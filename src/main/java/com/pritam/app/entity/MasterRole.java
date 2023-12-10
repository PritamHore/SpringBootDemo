package com.pritam.app.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Component
@Table(name = "master_role")
@Getter
@Setter
@ToString
public class MasterRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mr_mst_role_id", nullable = false)
	private Long id; 
	
	@Column(name = "mr_mst_role_name",  nullable = false)
	private String name;
	
	@Column(name = "mr_mst_role_desc", nullable = false)
	private String description;
	
//	 @ManyToMany(mappedBy = "roles")
//	 private Set<UserEntity> users = new HashSet<>();
}
