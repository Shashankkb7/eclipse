package com.xworkz.crud.repository;

import com.xworkz.crud.dto.IplDTO;

public interface IplRepository {

	boolean create(IplDTO dto);

	default int total() {
		return 0;

	}
}
