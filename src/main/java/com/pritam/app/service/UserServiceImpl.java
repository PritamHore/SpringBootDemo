package com.pritam.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pritam.app.dto.UserDto;
import com.pritam.app.entity.UserEntity;
import com.pritam.app.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserEntity userEntity;
	
	@Override
	public int createUser(UserDto userDto) {
		
		userEntity.setFirstName(userDto.getFirstName());
		userEntity.setLastName(userDto.getLastName());
		userEntity.setEmail(userDto.getEmail());
		userEntity.setMobile(userDto.getMobile());
		userEntity.setRole(userDto.getRole());
		userEntity.setCreatedOn(userDto.getCreatedOn());
		
		userEntity = userRepo.save(userEntity);
		
		return userEntity.getId();
	}

	@Override
	public List<UserEntity> fetchAllUsers() {
				
		return userRepo.findAll();
	}

	@Override
	public Optional<UserEntity> fetchUserById(Integer id) {
		
		return userRepo.findById(id);
	}
	
	

}
