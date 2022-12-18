package com.xworkz.crud.service;

import com.xworkz.crud.dto.BuildingDTO;
import com.xworkz.crud.exception.InvalidBuildingRoomException;
import com.xworkz.crud.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService {

	private BuildingRepository repository;

	public BuildingServiceImpl(BuildingRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(BuildingDTO dto) throws InvalidBuildingRoomException {
		System.out.println("Running validateAndSave " + dto);
		int no = dto.getNo();
		String name = dto.getName();
		int noOfFloors = dto.getNoOfFloors();
		boolean lift = dto.isLift();
		boolean parking = dto.isParking();
		String type = dto.getType();
		boolean validNo = false;
		boolean validName = false;
		boolean validNoOfFloors = false;
		boolean validLift = false;
		boolean validParking = false;
		boolean validType = false;
		if (no >= 5 && no <= 20) {
			System.out.println("Valid no");
			validNo = true;
		} else {
			System.err.println("Invalid no " + no);
		}

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Valid name");
			validName = true;
		} else {
			System.err.println("Invalid name " + name);
		}

		if (noOfFloors >= 1 && noOfFloors <= 20) {
			System.out.println("Valid noOfFloors");
			validNoOfFloors = true;
		} else {
			System.err.println("Invalid noOfFloors " + noOfFloors);
		}

		if (lift == true) {
			System.out.println("Valid lift");
			validLift = true;
		} else {
			System.err.println("Invalid lift " + lift);
		}

		if (parking == true) {
			System.out.println("Valid parking");
			validParking = true;
		} else {
			System.err.println("Invalid parking " + parking);
		}

		if (type != null && type.length() >= 4 && type.length() <= 20) {
			System.out.println("Valid type");
			validType = true;
		} else {
			System.err.println("Invalid type " + type);
		}

		if (validNo && validName && validLift && validNoOfFloors && validParking && validType) {
			System.out.println("Data is valid ");
			boolean saved = this.repository.available(dto);
			System.out.println("Data is saved success " + saved);
			return saved;
		} else {
			throw new InvalidBuildingRoomException("Check the data");
		}

	}

}
