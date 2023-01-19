package com.xworkz.soldierCrud.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldierCrud.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Registering save in ResortRepoImpl");
		System.out.println("dto " + dto);
		return true;
	}

}
