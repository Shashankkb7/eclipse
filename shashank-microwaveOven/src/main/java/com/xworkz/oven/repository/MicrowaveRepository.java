package com.xworkz.oven.repository;

import com.xworkz.oven.entity.MicrowaveEntity;

public interface MicrowaveRepository {

	boolean save(MicrowaveEntity entity);

	default MicrowaveEntity findById(int id) {
		return null;
	}
}
