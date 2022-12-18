package com.xworkz.crud.repository;

import com.xworkz.crud.dto.TheatreDTO;
import com.xworkz.crud.exception.StorageFullException;

public class TheatreRepositoryImpl implements TheatreRepository {

	private TheatreDTO[] theatre = new TheatreDTO[5];
	private int liveIndex = 0;

	@Override
	public boolean show(TheatreDTO dto) {
		System.out.println("Running store in TheatreRepositoryImpl " + dto);
		if (this.liveIndex >= this.theatre.length) {
			System.err.println("Cannot add more theatre");
			throw new StorageFullException("storage is full max size is needed " + dto);
		}
		this.theatre[this.liveIndex] = dto;
		System.out.println("Saved dto into index " + this.liveIndex);
		this.liveIndex++;

		return true;
	}

}
