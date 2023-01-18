package com.xworkz.soldierCrud.service;

import com.xworkz.soldierCrud.dto.SoldierDTO;

public interface SoldierService {

	boolean validateAndSave(SoldierDTO dto);
}
