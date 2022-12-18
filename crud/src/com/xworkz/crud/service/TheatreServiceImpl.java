package com.xworkz.crud.service;

import com.xworkz.crud.dto.TheatreDTO;
import com.xworkz.crud.exception.InvalidTheatreException;
import com.xworkz.crud.repository.TheatreRepository;

public class TheatreServiceImpl implements TheatreService {

	private TheatreRepository repository;

	public TheatreServiceImpl(TheatreRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(TheatreDTO dto) throws InvalidTheatreException {
		System.out.println("Running validateAndSave " + dto);
		int id = dto.getId();
		String name = dto.getName();
		String brand = dto.getBrand();
		int noOfSeats = dto.getNoOfSeats();
		boolean validId = false;
		boolean validName = false;
		boolean validBrand = false;
		boolean validNoOfSeats = false;
		if (id >= 123456 && id <= 987654) {
			System.out.println("Valid id");
			validId = true;
		} else {
			System.err.println("Invalid id " + id);
		}

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Valid name");
			validName = true;
		} else {
			System.err.println("Invalid name " + name);
		}

		if (brand != null && brand.length() >= 3 && brand.length() <= 20) {
			System.out.println("Valid brand");
			validBrand = true;
		} else {
			System.err.println("Invalid brand " + brand);
		}

		if (noOfSeats >= 3 && noOfSeats <= 50) {
			System.out.println("Valid noOfSeats");
			validNoOfSeats = true;
		} else {
			System.err.println("Invalid noOfSeats " + noOfSeats);
		}

		if (validId && validName && validBrand && validNoOfSeats) {
			System.out.println("Valid data we can store");
			boolean saved = this.repository.show(dto);
			System.out.println("Data is saved successfully " + saved);
			return saved;
		} else {
			throw new InvalidTheatreException("Check the data i have passed");
		}
	}
}
