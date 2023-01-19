package com.xworkz.soldierCrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldierCrud.dto.ResortDTO;
import com.xworkz.soldierCrud.repository.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService {
	@Autowired
	private Validator validator;
	private ResortRepo reosrtRepo;

	@Autowired
	public ResortServiceImpl(ResortRepo reosrtRepo) {
		this.reosrtRepo = reosrtRepo;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Registering validateAndSave in ResortServiceImpl");
		System.out.println("dto " + dto);

		Set<ConstraintViolation<ResortDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("There are some errors");
			return false;
		} else {
			System.out.println("Data is valid");
			boolean saved = reosrtRepo.save(dto);
			System.out.println("saved " + saved);
			return saved;
		}

	}

}
