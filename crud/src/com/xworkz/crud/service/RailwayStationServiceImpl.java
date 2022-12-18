package com.xworkz.crud.service;

import com.xworkz.crud.dto.RailwayStationDTO;
import com.xworkz.crud.exception.InvalidRailwayException;
import com.xworkz.crud.repository.RailwayStationRepository;

public class RailwayStationServiceImpl implements RailwayStationService {

	private RailwayStationRepository repository;

	public RailwayStationServiceImpl(RailwayStationRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(RailwayStationDTO dto) throws InvalidRailwayException {
		System.out.println("Running validateAndSave " + dto);
		String name = dto.getName();
		int noOfPlatforms = dto.getNoOfPlatforms();
		String area = dto.getArea();
		double platformTicketPrice = dto.getPlatformTicketPrice();
		boolean validName = false;
		boolean validNoOfPlatforms = false;
		boolean validArea = false;
		boolean validPlatformTicketPrice = false;

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Valid name");
			validName = true;
		} else {
			System.err.println("Invalid name " + name);
		}

		if (noOfPlatforms >= 2 && noOfPlatforms <= 10) {
			System.out.println("Valid noOfPlatforms");
			validNoOfPlatforms = true;
		} else {
			System.err.println("Invalid noOfPlatforms " + noOfPlatforms);
		}

		if (area != null && area.length() >= 3 && area.length() <= 20) {
			System.out.println("Valid area");
			validArea = true;
		} else {
			System.err.println("Invalid area " + area);
		}

		if (platformTicketPrice >= 5 && noOfPlatforms <= 20) {
			System.out.println("Valid platformTicketPrice");
			validPlatformTicketPrice = true;
		} else {
			System.err.println("Invalid platformTicketPrice " + platformTicketPrice);
		}

		if (validName && validNoOfPlatforms && validArea && validPlatformTicketPrice) {
			System.out.println("Data is valid ");
			boolean saved = this.repository.buyTicket(dto);
			System.out.println("Data is saved success " + saved);
			return saved;
		} else {
			throw new InvalidRailwayException("Check the data passed");
		}

	}

}
