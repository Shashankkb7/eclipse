package com.xworkz.crud.boot;

import com.xworkz.crud.dto.TerroristDTO;
import com.xworkz.crud.service.TerroristService;
import com.xworkz.crud.service.TerroristServiceImpl;

public class TerroristRunner {

	public static void main(String[] args) {

		TerroristDTO terroristDTO = new TerroristDTO();
		terroristDTO.setName("Neeraj");
		terroristDTO.setAge(23);
		terroristDTO.setCountry("Pakistan");
		terroristDTO.setOrganization("ISI");
		System.out.println(terroristDTO);

		TerroristService service = new TerroristServiceImpl();
		service.validateAndSave(terroristDTO);
	}

}
