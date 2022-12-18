package com.xworkz.crud.service;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.InvalidBakeryDataException;
import com.xworkz.crud.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {

	private BakeryRepository repository;

	public BakeryServiceImpl(BakeryRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) throws InvalidBakeryDataException {
		System.out.println("Running validateAndSave " + dto);
		String name = dto.getName();
		String ownerName = dto.getOwnerName();
		String location = dto.getLocation();
		String famousFor = dto.getFamousFor();
		long phNo = dto.getPhNo();
		boolean validName = false;
		boolean validOwnerName = false;
		boolean validFamousFor = false;
		boolean validLocation = false;
		boolean validPhNo = false;

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Valid name");
			validName = true;
		} else {
			System.err.println("Invalid name " + name);
		}

		if (ownerName != null && ownerName.length() >= 3 && ownerName.length() <= 20) {
			System.out.println("Valid ownerName");
			validOwnerName = true;
		} else {
			System.err.println("Invalid ownerName " + ownerName);
		}

		if (location != null && location.length() >= 3 && location.length() <= 20) {
			System.out.println("Valid location");
			validLocation = true;
		} else {
			System.err.println("Invalid location " + location);
		}

		if (famousFor != null && famousFor.length() >= 3 && famousFor.length() <= 20) {
			System.out.println("Valid famousFor");
			validFamousFor = true;
		} else {
			System.err.println("Invalid name " + famousFor);
		}

		if (phNo > 1234563L && phNo < 9876543210L) {
			System.out.println("Valid phNo");
			validPhNo = true;
		} else {
			System.err.println("Invalid phNo " + phNo);
		}
		
		if (validName && validOwnerName && validFamousFor && validLocation && validPhNo) {
			System.out.println("Data is valid can store");
			boolean saved = this.repository.store(dto);
			System.out.println("Data is saved successfully " + saved);
			return saved;
		} else {
			throw new InvalidBakeryDataException("Check the data i have passed");
		}
	}

}
