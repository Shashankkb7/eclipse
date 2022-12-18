package com.xworkz.crud.boot;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.TheatreDTO;
import com.xworkz.crud.exception.InvalidTheatreException;
import com.xworkz.crud.repository.TheatreRepository;
import com.xworkz.crud.repository.TheatreRepositoryImpl;
import com.xworkz.crud.service.TheatreService;
import com.xworkz.crud.service.TheatreServiceImpl;

public class TheatreRunner {

	public static void main(String[] args) {

		TheatreDTO dto = new TheatreDTO(456123, "Orion", "PVR", 45, "SYSTEM", LocalDateTime.now(), "USER",
				LocalDateTime.now());

		TheatreRepository repository = new TheatreRepositoryImpl();

		TheatreService service = new TheatreServiceImpl(repository);

		try {
			service.validateAndSave(dto);

		} catch (InvalidTheatreException e) {
			e.printStackTrace();
		}
	}

}
