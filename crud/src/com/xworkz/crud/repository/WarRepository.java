package com.xworkz.crud.repository;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.WarDTO;

public interface WarRepository {

	boolean create(WarDTO dto);

	boolean create(WarDTO[] dto);

	default int total() {
		return 0;
	}

	default WarDTO findByStartedBy(String startedBy) {
		return null;
	}

	default WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		return null;
	}

	default WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime startedDate) {
		return null;
	}

	default WarDTO findByStartDateLesserThanOrEqualTo(LocalDateTime startedDate) {
		return null;
	}

	default WarDTO findByStartDateAndEndDate(LocalDateTime startedIn, LocalDateTime endedIn) {
		return null;

	}
}
