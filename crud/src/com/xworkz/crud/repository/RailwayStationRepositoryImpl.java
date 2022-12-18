package com.xworkz.crud.repository;

import com.xworkz.crud.dto.RailwayStationDTO;
import com.xworkz.crud.exception.StorageFullException;

public class RailwayStationRepositoryImpl implements RailwayStationRepository {
	private RailwayStationDTO[] railway = new RailwayStationDTO[10];
	private int presentIndex = 0;

	@Override
	public boolean buyTicket(RailwayStationDTO dto) {
		System.out.println("Running buyTicket " + dto);
		if (this.presentIndex >= this.railway.length) {
			System.err.println("Cannot add more RailwayStation");
			throw new StorageFullException("storage is full max size is needed " + dto);
		}
		this.railway[this.presentIndex] = dto;
		System.out.println("Saved dto into index " + this.presentIndex);
		this.presentIndex++;

		return true;
	}

}
