package com.pritam.app.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private Long mobile;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Kolkata")
	private Date createdOn = new Date();
	
	private byte role;
}
