package com.pritam.app.service;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pritam.app.dto.GlobalResDto;
import com.pritam.app.dto.MasterGetDto;
import com.pritam.app.entity.MasterRole;
import com.pritam.app.repo.RoleRepo;

import jakarta.validation.Valid;

@Service
public class MasterServiceImpl implements MasterService {

	@Autowired
	private RoleRepo roleRepo;

	@Autowired
	private MasterRole masterRole;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<MasterGetDto> getAllRoles() {
		return Arrays.asList(modelMapper.map(roleRepo.findAll(), MasterGetDto[].class));

	}
	
	@Override
	public MasterGetDto getByName(String name) {
		
		masterRole = roleRepo.findByName(name.toUpperCase());
		if(masterRole != null) {
			return new MasterGetDto(masterRole.getId().intValue(),masterRole.getName().toUpperCase(),masterRole.getDescription());
		}else {
			return new MasterGetDto(0,name.toUpperCase(),"Does not exist!");
		}

		
	}

	@Override
	public GlobalResDto createRole(MasterGetDto masterDto) {

		MasterRole role = roleRepo.findByName(masterDto.getName().toUpperCase());

		if (role != null) {
			return new GlobalResDto(0,
					"Role '" + masterDto.getName().toUpperCase() + "' is already exist!");
			
		}else {
			masterRole.setName(masterDto.getName().toUpperCase());
			masterRole.setDescription(masterDto.getDescription());

			masterRole = roleRepo.save(masterRole);

			return new GlobalResDto(masterRole.getId().intValue(),
					"Role '" + masterRole.getDescription() + "' has been created");
		}
	}

}
