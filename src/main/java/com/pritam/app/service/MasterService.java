package com.pritam.app.service;

import java.util.List;

import com.pritam.app.dto.GlobalResDto;
import com.pritam.app.dto.MasterGetDto;

import jakarta.validation.Valid;

public interface MasterService {

	List<MasterGetDto> getAllRoles();

	GlobalResDto createRole(@Valid MasterGetDto masterDto);

	MasterGetDto getByName(String name);

}
