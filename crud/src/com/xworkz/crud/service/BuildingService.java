package com.xworkz.crud.service;

import com.xworkz.crud.dto.BuildingDTO;
import com.xworkz.crud.exception.InvalidBuildingRoomException;

public interface BuildingService {

	boolean validateAndSave(BuildingDTO dto) throws InvalidBuildingRoomException;
}
