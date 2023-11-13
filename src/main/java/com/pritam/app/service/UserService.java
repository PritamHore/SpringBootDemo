package com.pritam.app.service;

import java.util.List;
import java.util.Optional;

import com.pritam.app.dto.UserDto;
import com.pritam.app.entity.UserEntity;

public interface UserService {

	int createUser(UserDto userDto);

	List<UserEntity> fetchAllUsers();

	Optional<UserEntity> fetchUserById(Integer id);

}
