package com.xworkz.crud.repository;

import com.xworkz.crud.dto.BuildingDTO;
import com.xworkz.crud.exception.BuildingSizeException;

public class BuildingRepositoryImpl implements BuildingRepository {

	private BuildingDTO[] building = new BuildingDTO[10];
	private int presentIndex = 0;

	@Override
	public boolean available(BuildingDTO dto) {
		System.out.println("Running available " + dto);
		if (this.presentIndex >= this.building.length) {
			System.err.println("Cannot add more building");
			throw new BuildingSizeException("BuildingSize is full max size is needed " + dto);
		}
		this.building[this.presentIndex] = dto;
		System.out.println("Saved dto into index " + this.presentIndex);
		this.presentIndex++;

		return true;
	}

}
