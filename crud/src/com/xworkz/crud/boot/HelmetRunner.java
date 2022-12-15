package com.xworkz.crud.boot;

import com.xworkz.crud.constant.Color;
import com.xworkz.crud.constant.HelmetType;
import com.xworkz.crud.dto.HelmetDTO;
import com.xworkz.crud.repository.HelmetRepository;
import com.xworkz.crud.repository.HelmetRepositoryImpl;
import com.xworkz.crud.service.HelmetService;
import com.xworkz.crud.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {

		HelmetDTO dto = new HelmetDTO("Axor", HelmetType.OFF_ROAD, 5000D, Color.BLACK);
		HelmetRepository repository = new HelmetRepositoryImpl();

		HelmetService helmetService = new HelmetServiceImpl(repository);

		boolean success = helmetService.validateAndSave(dto);
		System.out.println("Success " + success);

	}

}
