package com.xworkz.soldierCrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldierCrud.dto.SoldierDTO;
import com.xworkz.soldierCrud.repository.SoldierRepository;

public class SoldierServiceImpl implements SoldierService {

	private SoldierRepository repository;

	public SoldierServiceImpl() {
		System.out.println("Creating SoldierServiceImpl using no-arg const");
	}

	public void setRepository(SoldierRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Executing validateAndSave start in SoldierServiceImpl");
		System.out.println("Dto passed " + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.err.println("Error is there");
			violations.forEach(c -> System.err.println(c.getMessage()));
			return false;
		} else {
			System.out.println("Data is valid");
			boolean saved = repository.save(dto);
			System.out.println("Dto saved using repo " + saved);
			return saved;
		}

	}

}
