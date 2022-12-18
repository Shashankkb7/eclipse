package com.xworkz.crud.service;

import com.xworkz.crud.dto.TheatreDTO;
import com.xworkz.crud.exception.InvalidTheatreException;

public interface TheatreService {

	boolean validateAndSave(TheatreDTO dto) throws InvalidTheatreException;
}
