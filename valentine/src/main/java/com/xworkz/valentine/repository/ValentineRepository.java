package com.xworkz.valentine.repository;

import com.xworkz.valentine.entity.ValentineEntity;

public interface ValentineRepository {

	boolean save(ValentineEntity entity);

	default ValentineEntity findById(int id) {
		return null;
	}
}
