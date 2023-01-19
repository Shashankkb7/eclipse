package com.xworkz.soldierCrud.repository;

import com.xworkz.soldierCrud.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepository {

	public SoldierRepoImpl() {
		System.out.println("Creating SoldierRepoImpl using no-arg const");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Running save SoldierRepoImpl");
		System.out.println("Dto is passed " + dto);
		return false;
	}

}
