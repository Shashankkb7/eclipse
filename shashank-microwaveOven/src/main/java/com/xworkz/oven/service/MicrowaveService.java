package com.xworkz.oven.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.oven.dto.MicrowaveDTO;

public interface MicrowaveService {

	Set<ConstraintViolation<MicrowaveDTO>> validateAndSave(MicrowaveDTO dto);

	default MicrowaveDTO findById(int id) {
		return null;
	}
	
	default MicrowaveDTO deleteById(int id) {
		return null;
	}

	default List<MicrowaveDTO> findByName(String name) {
		return Collections.emptyList();
	}

	Set<ConstraintViolation<MicrowaveDTO>> validateAndUpdate(MicrowaveDTO dto);
}
