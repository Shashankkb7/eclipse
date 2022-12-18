package com.xworkz.crud.service;

import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.InvalidPlaceException;
import com.xworkz.crud.repository.PlaceRepository;

public class PlaceServiceImpl implements PlaceService {

	private PlaceRepository repository;

	public PlaceServiceImpl(PlaceRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(PlaceDTO dto) throws InvalidPlaceException {
		System.out.println("Running validateAndSave " + dto);
		String name = dto.getName();
		double totalArea = dto.getTotalArea();
		String famousFor = dto.getFamousFor();
		String stateName = dto.getStateName();
		int pincode = dto.getPincode();
		boolean validName = false;
		boolean validTotalArea = false;
		boolean validFamousFor = false;
		boolean validStateName = false;
		boolean validPincode = false;
		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Valid name");
			validName = true;
		} else {
			System.err.println("Invalid name " + name);
		}

		if (totalArea >= 100 && totalArea <= 10000) {
			System.out.println("Valid totalArea");
			validTotalArea = true;
		} else {
			System.err.println("Invalid totalArea " + totalArea);
		}

		if (famousFor != null && famousFor.length() >= 3 && famousFor.length() <= 20) {
			System.out.println("Valid famousFor");
			validFamousFor = true;
		} else {
			System.err.println("Invalid famousFor " + famousFor);
		}

		if (stateName != null && stateName.length() >= 3 && stateName.length() <= 20) {
			System.out.println("Valid stateName");
			validStateName = true;
		} else {
			System.err.println("Invalid stateName " + stateName);
		}

		if (pincode >= 123456 && pincode <= 987654) {
			System.out.println("Valid pincode");
			validPincode = true;
		} else {
			System.err.println("Invalid pincode " + pincode);
		}

		if (validName && validTotalArea && validFamousFor && validStateName && validPincode) {
			System.out.println("Data is valid");
			boolean saved = this.repository.living(dto);
			System.out.println("Data is saved success " + saved);
			return saved;
		} else {
			throw new InvalidPlaceException("Check the data passed");
		}
	}

}
