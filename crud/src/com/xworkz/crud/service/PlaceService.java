package com.xworkz.crud.service;

import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.InvalidPlaceException;

public interface PlaceService {

	boolean validateAndSave(PlaceDTO dto) throws InvalidPlaceException;
}
