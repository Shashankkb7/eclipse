package com.xworkz.crud.repository;

import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.PlaceTotalAreaExceedException;

public class PlaceRepositoryImpl implements PlaceRepository {

	private PlaceDTO[] place = new PlaceDTO[10];
	private int liveIndex = 0;

	@Override
	public boolean living(PlaceDTO dto) {
		System.out.println("Running living " + dto);
		if (this.liveIndex >= this.place.length) {
			System.err.println("Cannot add more Place");
			throw new PlaceTotalAreaExceedException("Area is full max size is needed");
		}
		this.place[this.liveIndex] = dto;
		System.out.println("Saved dto into index " + this.liveIndex);
		this.liveIndex++;
		return true;
	}

}
