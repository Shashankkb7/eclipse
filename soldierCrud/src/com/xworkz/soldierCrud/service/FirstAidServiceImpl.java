package com.xworkz.soldierCrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldierCrud.dto.FirstAidDTO;
import com.xworkz.soldierCrud.repository.FirstAidRepo;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class FirstAidServiceImpl implements FirstAidService {

	private FirstAidRepo firstAidRepo;
	@Autowired
	private Validator validator;

	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
		System.out.println("Created Service by passing repo in FirstAidServiceImpl");
	}

	@Override
	public boolean validateAndSave(FirstAidDTO aidDTO) {
		System.out.println("Executing validateAndSave start in FirstAidServiceImpl");
		System.out.println("aidDTO " + aidDTO);

		Set<ConstraintViolation<FirstAidDTO>> violations = validator.validate(aidDTO);
		if (!violations.isEmpty()) {
			System.out.println("There are some errors");
			return false;
		} else {
			System.out.println("Data is valid");
			boolean saved = firstAidRepo.save(aidDTO);
			System.out.println(saved);
			return saved;
		}

	}

}
