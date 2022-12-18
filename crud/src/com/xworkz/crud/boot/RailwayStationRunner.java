package com.xworkz.crud.boot;

import com.xworkz.crud.dto.RailwayStationDTO;
import com.xworkz.crud.exception.InvalidRailwayException;
import com.xworkz.crud.repository.RailwayStationRepository;
import com.xworkz.crud.repository.RailwayStationRepositoryImpl;
import com.xworkz.crud.service.RailwayStationService;
import com.xworkz.crud.service.RailwayStationServiceImpl;

public class RailwayStationRunner {

	public static void main(String[] args) {

		RailwayStationDTO dto = new RailwayStationDTO("KSR Railway station", 8, "Majestic", 10);

		RailwayStationRepository repository = new RailwayStationRepositoryImpl();

		RailwayStationService service = new RailwayStationServiceImpl(repository);
		try {
			System.out.println("Before calling validate");
			service.validateAndSave(dto);
			System.out.println("After calling validate");
		} catch (InvalidRailwayException e) {
			e.printStackTrace();
		}
		System.out.println("After catch block");
	}

}
