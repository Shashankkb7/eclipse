package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.ValentineEntity;
import com.xworkz.valentine.repository.ValentineRepository;

@Service
public class ValentineServiceImpl implements ValentineService {
	@Autowired
	private ValentineRepository valentineRepository;

	public ValentineServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto " + dto);
			return violations;
		} else {
			System.out.println("Violations is not there in dto,can save");
			ValentineEntity entity = new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setPlace(dto.getPlace());
			entity.setGift(dto.getGift());
			boolean saved = this.valentineRepository.save(entity);
			System.out.println("Entity data is saved " + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public ValentineDTO findById(int id) {
		if (id > 0) {
			ValentineEntity entity = this.valentineRepository.findById(id);
			if (entity != null) {
				System.out.println("Entity is found in service for id " + id);
				ValentineDTO dto = new ValentineDTO();
				dto.setName(entity.getName());
				dto.setValentineName(entity.getValentineName());
				dto.setPlace(entity.getPlace());
				dto.setGift(entity.getGift());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return ValentineService.super.findById(id);
	}

}
