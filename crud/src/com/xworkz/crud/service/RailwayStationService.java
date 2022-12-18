package com.xworkz.crud.service;

import com.xworkz.crud.dto.RailwayStationDTO;
import com.xworkz.crud.exception.InvalidRailwayException;

public interface RailwayStationService {

	boolean validateAndSave(RailwayStationDTO dto) throws InvalidRailwayException;
}
