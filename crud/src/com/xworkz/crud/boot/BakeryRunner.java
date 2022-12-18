package com.xworkz.crud.boot;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.InvalidBakeryDataException;
import com.xworkz.crud.repository.BakeryRepository;
import com.xworkz.crud.repository.BakeryRepositoryImpl;
import com.xworkz.crud.service.BakeryService;
import com.xworkz.crud.service.BakeryServiceImpl;

public class BakeryRunner {

	public static void main(String[] args) {

		BakeryDTO dto = new BakeryDTO("Spoorthi Bakery", "Spoorthi", "Shivamogga", "Sompapudi", 123456789L, null, null,
				null, null);
		BakeryDTO dto1 = new BakeryDTO("Spoorthi Bakery", "Spoorthi", "Shivamogga", "Sompapudi", 123456789L, null, null,
				null, null);
		BakeryDTO dto2 = new BakeryDTO("Spoorthi Bakery", "Spoorthi", "Shivamogga", "Sompapudi", 123456789L, null, null,
				null, null);
		BakeryDTO dto3 = new BakeryDTO("Spoorthi Bakery", "Spoorthi", "Shivamogga", "Sompapudi", 123456789L, null, null,
				null, null);
		BakeryDTO dto4 = new BakeryDTO("Spoorthi Bakery", "Spoorthi", "Shivamogga", "Sompapudi", 123456789L, null, null,
				null, null);
		// BakeryDTO dto5 = new BakeryDTO("Spoorthi Bakery", "Spoorthi", "Shivamogga",
		// "Sompapudi", 123456789L);

		BakeryRepository repository = new BakeryRepositoryImpl();

		BakeryService service = new BakeryServiceImpl(repository);

		try {
			System.out.println("Before calling validate and save");
			service.validateAndSave(dto);
			/*service.validateAndSave(dto1);
			service.validateAndSave(dto2);
			service.validateAndSave(dto3);
			service.validateAndSave(dto4);*/
			// service.validateAndSave(dto5);

			System.out.println("After calling validate and save");
		} catch (InvalidBakeryDataException e) {
			e.printStackTrace();
		}
		System.out.println("After catch block");
	}

}
