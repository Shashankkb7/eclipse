package com.xworkz.crud.boot;

import com.xworkz.crud.dto.BuildingDTO;
import com.xworkz.crud.exception.InvalidBuildingRoomException;
import com.xworkz.crud.repository.BuildingRepository;
import com.xworkz.crud.repository.BuildingRepositoryImpl;
import com.xworkz.crud.service.BuildingService;
import com.xworkz.crud.service.BuildingServiceImpl;

public class BuildingRunner {

	public static void main(String[] args) {

		BuildingDTO dto = new BuildingDTO(6, "Brigade", 8, true, true, "Residential");

		BuildingRepository repository = new BuildingRepositoryImpl();

		BuildingService service = new BuildingServiceImpl(repository);
		try {
			System.out.println("Before validation");
			service.validateAndSave(dto);
			System.out.println("After validation");
		} catch (InvalidBuildingRoomException e) {
			e.printStackTrace();
		}
		System.out.println("After catch blocks");
	}

}
