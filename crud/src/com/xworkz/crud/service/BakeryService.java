package com.xworkz.crud.service;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.InvalidBakeryDataException;

public interface BakeryService {

	boolean validateAndSave(BakeryDTO dto) throws InvalidBakeryDataException;

}
