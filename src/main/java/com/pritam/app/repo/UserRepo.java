package com.pritam.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pritam.app.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{

}
