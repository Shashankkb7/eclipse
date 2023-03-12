package com.xworkz.oven.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.oven.entity.MicrowaveEntity;

public interface MicrowaveRepository {

	boolean save(MicrowaveEntity entity);

	boolean update(MicrowaveEntity entity);

	default MicrowaveEntity findById(int id) {
		return null;
	}

	default MicrowaveEntity deleteById(int id) {
		return null;
	}

	default List<MicrowaveEntity> findByName(String name) {
		return Collections.emptyList();
	}
	
	default List<MicrowaveEntity> findByColor(String color) {
		return Collections.emptyList();
	}

	default List<MicrowaveEntity> findByNameAndColor(String name,String color) {
		return Collections.emptyList();
	}
	
	default List<MicrowaveEntity> findAll() {
		return Collections.emptyList();
	}
}
