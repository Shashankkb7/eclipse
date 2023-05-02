package com.xworkz.commonModules.repository;

import java.time.LocalTime;
import java.util.List;

import com.xworkz.commonModules.entity.ApplicationEntity;
import com.xworkz.commonModules.entity.TechnologyEntity;

public interface ApplicationRepository {
	
	List<ApplicationEntity> findAll();

	boolean save(ApplicationEntity entity);
	
	default Long findByEmail(String email) {
		return null;
	}

	default Long findByMobile(Long mobile) {
		return null;
	}

	default Long findByUser(String userId) {
		return null;
	}
	
	Long checkDuplicates(String userId,String email,Long mobile);
	
	default ApplicationEntity findBySignIn(String userId) {
		return null;
	}

	boolean loginCount(String userId,int count);
	
	default ApplicationEntity reSetPassword(String email) {
		return null;
	}
	
	boolean update(ApplicationEntity entity);
	
	boolean updatePassword(String userId,String password,Boolean resetPassword,LocalTime passwordChangeTime);
	
	boolean saveTechnology(TechnologyEntity entity);
	
	default List<TechnologyEntity> findByView(int id) {
		return null;
	}
	
	default ApplicationEntity findById(int id) {
		return null;
	}
}
