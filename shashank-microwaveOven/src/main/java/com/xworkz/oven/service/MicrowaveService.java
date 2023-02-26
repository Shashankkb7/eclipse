package com.xworkz.oven.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.oven.dto.MicrowaveDTO;

public interface MicrowaveService {

	Set<ConstraintViolation<MicrowaveDTO>> validateAndSave(MicrowaveDTO dto);

	default MicrowaveDTO findById(int id) {
		return null;
	}
}
