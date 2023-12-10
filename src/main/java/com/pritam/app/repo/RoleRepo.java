package com.pritam.app.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pritam.app.entity.MasterRole;

@Repository
public interface RoleRepo extends JpaRepository<MasterRole, Long>{

	MasterRole findByName(String name);

//	Set<MasterRole> findByName(byte role);


}
