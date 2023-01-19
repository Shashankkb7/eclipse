package com.xworkz.soldierCrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldierCrud.dto.MissileDTO;
import com.xworkz.soldierCrud.repository.MissileRepo;

@Component
public class MissileServiceImpl implements MissileService {
	@Autowired
	private Validator validator;
	private MissileRepo missileRepo;

	@Autowired
	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missileRepo = missileRepo;
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("Creating validateAndSave start in MissileServiceImpl");
		System.out.println("dto " + dto);

		Set<ConstraintViolation<MissileDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("There are some errors");
			return false;
		} else {
			System.out.println("Data is valid");
			boolean saved = missileRepo.save(dto);
			System.out.println("saved " + saved);
			return saved;
		}

	}

}
