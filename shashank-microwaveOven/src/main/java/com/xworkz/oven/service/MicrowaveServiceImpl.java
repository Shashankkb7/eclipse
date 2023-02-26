package com.xworkz.oven.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.oven.dto.MicrowaveDTO;
import com.xworkz.oven.entity.MicrowaveEntity;
import com.xworkz.oven.repository.MicrowaveRepository;

@Service
public class MicrowaveServiceImpl implements MicrowaveService {

	@Autowired
	private MicrowaveRepository microwaveRepository;

	public MicrowaveServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<MicrowaveDTO>> validateAndSave(MicrowaveDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<MicrowaveDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto " + dto);
			return violations;
		} else {
			System.out.println("Violations is not there in dto,can save");
			MicrowaveEntity entity = new MicrowaveEntity();
			entity.setName(dto.getName());
			entity.setPrice(dto.getPrice());
			entity.setCapacity(dto.getCapacity());
			entity.setColor(dto.getColor());
			entity.setSince(dto.getSince());
			boolean saved = this.microwaveRepository.save(entity);
			System.out.println("Entity data is saved " + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public MicrowaveDTO findById(int id) {
		if (id > 0) {
			MicrowaveEntity entity = this.microwaveRepository.findById(id);
			if (entity != null) {
				System.out.println("Entity is found in service for id " + id);
				MicrowaveDTO dto = new MicrowaveDTO();
				dto.setName(entity.getName());
				dto.setPrice(entity.getPrice());
				dto.setCapacity(entity.getCapacity());
				dto.setColor(entity.getColor());
				dto.setSince(entity.getSince());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return MicrowaveService.super.findById(id);
	}
}