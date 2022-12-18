package com.xworkz.crud.repository;

import com.xworkz.crud.dto.BuildingDTO;

public interface BuildingRepository {

	boolean available(BuildingDTO dto);
}
