package com.xworkz.crud.boot;

import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.InvalidPlaceException;
import com.xworkz.crud.repository.PlaceRepository;
import com.xworkz.crud.repository.PlaceRepositoryImpl;
import com.xworkz.crud.service.PlaceService;
import com.xworkz.crud.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {

		PlaceDTO dto = new PlaceDTO("Mullayangiri", 5000, "Peak", "Karnataka", 577515);

		PlaceRepository repository = new PlaceRepositoryImpl();

		PlaceService service = new PlaceServiceImpl(repository);
		try {
			System.out.println("Before validate");
			service.validateAndSave(dto);
			System.out.println("After validate");
		} catch (InvalidPlaceException e) {
			e.printStackTrace();
		}
		System.out.println("After catchBlock");

	}

}
