package com.xworkz.oven.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.oven.entity.MicrowaveEntity;

public interface MicrowaveRepository {

	boolean save(MicrowaveEntity entity);

	default MicrowaveEntity findById(int id) {
		return null;
	}

	default List<MicrowaveEntity> findByName(String name) {
		return Collections.emptyList();
	}
}
