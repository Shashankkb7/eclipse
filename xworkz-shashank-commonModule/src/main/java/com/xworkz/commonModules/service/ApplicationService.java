package com.xworkz.commonModules.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.commonModules.dto.ApplicationDTO;
import com.xworkz.commonModules.dto.TechnologyDTO;

public interface ApplicationService {

	Set<ConstraintViolation<ApplicationDTO>> validate(ApplicationDTO dto);
	
	List<ApplicationDTO> findAllService();

	boolean saveService(ApplicationDTO appDTO);
	
	default Long findByEmail(String email) {
		return null;
	}

	default Long findByMobile(Long mobile) {
		return null;
	}

	default Long findByUser(String userId) {
		return null;
	}
	
	boolean sendMail(String email,String text);

	Long checkDuplicates(String userId, String email, Long mobile);
	
	default ApplicationDTO findByUserAndPassword(String userId,String password) {
		return null;
	}
	
	default ApplicationDTO reSetPassword(String email) {
		return null;
	}
	default ApplicationDTO updatePassword(String userId, String password,String confirmPassword) {
		return null;
	}
	
	default ApplicationDTO updateProfile(String userId,String email,Long mobile,String path) {
		return null;
	}
	
	Set<ConstraintViolation<TechnologyDTO>> validateAndAddTechnology(TechnologyDTO dto);
	
	default List<TechnologyDTO> findByView(int id) {
		return Collections.emptyList();
	}
	
	default ApplicationDTO findById(int id) {
		return null;
	}
}
