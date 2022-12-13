package com.xworkz.crud.repository;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.WarDTO;
import com.xworkz.crud.exception.WarLimitExceedException;

public class WarRepositoryImpl implements WarRepository {

	private WarDTO[] kill = new WarDTO[10];
	private int warIndex = 0;

	@Override
	public boolean create(WarDTO dto) {
		System.out.println("Running warimpl");
		if (this.warIndex >= kill.length) {
			throw new WarLimitExceedException();
		}
		this.kill[warIndex] = dto;
		System.out.println("Saved to" + dto + "at index" + warIndex);
		this.warIndex++;
		return false;
	}

	@Override
	public boolean create(WarDTO[] dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int total() {
		System.out.println("Running total");
		return this.warIndex;

	}

	@Override
	public WarDTO findByStartedBy(String startedBy) {
		System.out.println("Running the findByStartedBy" + startedBy);
		for (WarDTO dto : kill) {
			if (dto != null && dto.getStartedBy().equalsIgnoreCase(startedBy)) {
				System.out.println("War started" + startedBy);
			}
		}
		System.out.println("dto not found");
		return WarRepository.super.findByStartedBy(startedBy);
	}

	@Override
	public WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		System.out.println("Running the findByStartedByAndStartedWith" + startedBy + startedWith);
		for (WarDTO dto : kill) {
			if (dto != null && dto.getStartedBy().equalsIgnoreCase(startedBy)
					&& dto.getStartedWith().equalsIgnoreCase(startedWith)) {
				System.out.println("War started by" + startedBy + "War started with" + startedWith);
			}
		}
		System.out.println("dto not found");
		return WarRepository.super.findByStartedByAndStartedWith(startedBy, startedWith);
	}

	@Override
	public WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime startedDate) {
		System.out.println("Running the findByStartDateGreaterThanOrEqualTo" + startedDate);
		for (WarDTO dto : kill) {
			if (dto != null && dto.getStartDate().isAfter(startedDate)) {
				System.out.println("War started by GreaterThanOrEqualTo" + startedDate);
			}
		}
		System.out.println("dto not found");
		return WarRepository.super.findByStartDateGreaterThanOrEqualTo(startedDate);
	}

	@Override
	public WarDTO findByStartDateLesserThanOrEqualTo(LocalDateTime startedDate) {
		System.out.println("Running the findByStartDateLesserThanOrEqualTo" + startedDate);
		for (WarDTO dto : kill) {
			if (dto != null) {
				System.out.println("War started by LesserThanOrEqualTo" + startedDate);
			}
		}
		System.out.println("dto not found");
		return WarRepository.super.findByStartDateLesserThanOrEqualTo(startedDate);
	}

	@Override
	public WarDTO findByStartDateAndEndDate(LocalDateTime startedIn, LocalDateTime endedIn) {
		System.out.println("Running the findByStartDateAndEndDate" + startedIn + endedIn);
		for (WarDTO dto : kill) {
			if (dto != null) {
				System.out.println("War start date" + startedIn + "War end" + endedIn);
			}
		}
		System.out.println("dto not found");
		return WarRepository.super.findByStartDateAndEndDate(startedIn, endedIn);
	}
}
