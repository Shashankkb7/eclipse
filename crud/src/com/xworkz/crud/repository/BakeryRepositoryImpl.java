package com.xworkz.crud.repository;

import com.xworkz.crud.dto.BakeryDTO;

import com.xworkz.crud.exception.StorageFullException;

public class BakeryRepositoryImpl implements BakeryRepository {

	private BakeryDTO[] bakery = new BakeryDTO[5];
	private int liveIndex = 0;

	@Override
	public boolean store(BakeryDTO dto) {
		System.out.println("Running store in BakeryRepositoryImpl " + dto);
		if (this.liveIndex >= this.bakery.length) {
			System.err.println("Cannot add more bakery");
			throw new StorageFullException("storage is full max size is needed " + dto);
		}
		this.bakery[this.liveIndex] = dto;
		System.out.println("Saved dto into index " + this.liveIndex);
		this.liveIndex++;

		return true;
	}

}
