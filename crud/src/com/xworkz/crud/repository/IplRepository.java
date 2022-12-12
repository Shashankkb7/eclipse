package com.xworkz.crud.repository;

public interface IplRepository {

	boolean create(IplDTO dto);

	default int total() {
		return 0;

	}
}
