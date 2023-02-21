package com.xworkz.bigBasket.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bigBasket.dto.BigBasketDTO;
import com.xworkz.bigBasket.entity.BigBasketEntity;
import com.xworkz.bigBasket.repository.BigBasketRepository;

@Service
public class BigBasketServiceImpl implements BigBasketService {
	@Autowired
	private BigBasketRepository basketRepository;

	public BigBasketServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO dto) {
		System.out.println("Registering validateAndSave");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BigBasketDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto " + dto);
			return violations;
		} else {
			System.out.println("Violations is not there in dto,can save");
			BigBasketEntity entity = new BigBasketEntity();
			entity.setName(dto.getName());
			entity.setOwnerName(dto.getOwnerName());
			entity.setItem(dto.getItem());
			entity.setArea(dto.getArea());
			entity.setEmail(dto.getEmail());
			entity.setPassword(dto.getPassword());
			entity.setPhNo(dto.getPhNo());
			entity.setNoOfWorkers(dto.getNoOfWorkers());
			entity.setDiscount(dto.getDiscount());
			entity.setGstNo(dto.getGstNo());
			boolean saved = this.basketRepository.save(entity);
			System.out.println("Entity data is saved " + saved);
			return Collections.emptySet();
		}

	}
}
