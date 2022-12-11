package com.xworkz.exceptionalEvents.repository;

public interface EmailRepository {

	boolean create(String email);

	default int total() {
		return 0;
	}

}
