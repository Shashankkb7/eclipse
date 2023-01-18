package com.xworkz.soldierCrud.boot;

import com.xworkz.soldierCrud.dto.SoldierDTO;
import com.xworkz.soldierCrud.repository.SoldierRepoImpl;
import com.xworkz.soldierCrud.repository.SoldierRepository;
import com.xworkz.soldierCrud.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {

		SoldierDTO dto = new SoldierDTO("Sandeep", 110, "India", "Military ", "TopRank");
		SoldierServiceImpl serviceImpl = new SoldierServiceImpl();
		SoldierRepository repository = new SoldierRepoImpl();
		serviceImpl.setRepository(repository);
		serviceImpl.validateAndSave(dto);
	}

}
