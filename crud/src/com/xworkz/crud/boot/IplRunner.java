package com.xworkz.crud.boot;

import java.time.LocalDateTime;

import com.xworkz.crud.repository.IplDTO;
import com.xworkz.crud.repository.IplRepository;
import com.xworkz.crud.repository.IplRepositoryImple;

public class IplRunner {

	public static void main(String[] args) {

		IplRepository repository = new IplRepositoryImple();

		IplDTO dto = new IplDTO();
		dto.setTeamName("RCB");
		dto.setOwnerName("Anand Kripalu");
		dto.setCaptainName("Faf du plessis");
		dto.setNoOfPalyers(22);
		dto.setHeadCoachName("Sanjay Bangar");
		dto.setBattingCoachName("Simon Katich");
		dto.setBowlingCoachName("Adam Griffith");
		dto.setGerseyColor("Red");
		dto.setWins(107);
		dto.setDefeast(113);
		dto.setCreatedBy(null);
		dto.setCreatedDate(LocalDateTime.now());

		repository.create(dto);
	}

}
