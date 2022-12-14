package com.xworkz.crud.boot;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.PizzaSize;
import com.xworkz.crud.dto.PizzaDTO;
import com.xworkz.crud.service.PizzaService;
import com.xworkz.crud.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) {

		/*
		 * PizzaDTO dto = new PizzaDTO("Golden corn", "Dominos", PizzaSize.MEDIUM,
		 * "Spicy", "Veg", true, 200, "Shashank", LocalDateTime.now(), "Shashank K B",
		 * LocalDateTime.of(2022, 10, 21, 12, 22, 22));
		 */
		PizzaDTO dto = new PizzaDTO();
		dto.setName("Golden corn");
		dto.setCompany("Dominos");
		dto.setCheese(true);
		dto.setFlavour("Spicy");
		dto.setPrice(200);
		dto.setSize(PizzaSize.MEDIUM);
		dto.setType("Veg");
		dto.setCreatedBy("Shashank");
		dto.setCreatedDate(LocalDateTime.now());
		dto.setUpdatedBy("Shashank K B");
		dto.setUpdatedDate(LocalDateTime.of(2022, 10, 21, 12, 22, 22));

		PizzaService service = new PizzaServiceImpl();
		boolean saved = service.validDateAndSave(dto);
		System.out.println(saved);
	}

}
