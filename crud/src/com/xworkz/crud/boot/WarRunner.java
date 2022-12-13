package com.xworkz.crud.boot;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.WarDTO;
import com.xworkz.crud.repository.WarRepository;
import com.xworkz.crud.repository.WarRepositoryImpl;

public class WarRunner {

	public static void main(String[] args) {

		WarRepository repository = new WarRepositoryImpl();

		WarDTO war = new WarDTO();
		war.setName("Kalinga War");
		war.setEndDate(LocalDateTime.now());
		war.setNoOfDeaths(200);
		war.setStartDate(LocalDateTime.now());
		war.setStartedBy("Maurya Victory");
		war.setStartedWith("Kalinga");
		war.setWonBy("Maurya Victory");

		repository.create(war);
		repository.findByStartedByAndStartedWith("Maurya", "Kalinga");
		repository.findByStartDateGreaterThanOrEqualTo(LocalDateTime.now());
		repository.findByStartDateLesserThanOrEqualTo(LocalDateTime.now());
		repository.findByStartedBy("Maurya Victory");
		repository.findByStartDateAndEndDate(LocalDateTime.now(), LocalDateTime.now());
	}
}
