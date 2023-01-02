package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.DTO.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {

		Collection<PalaceDTO> collection = new ArrayList<PalaceDTO>();
		collection.add(new PalaceDTO("Mysore Palace", "Mysore", "Arun", false, 100));
		collection.add(new PalaceDTO("Bangalore Palace", "Bangalore", "Manu", false, 200));
		collection.add(new PalaceDTO("Lalit Mahal", "Mysore", "Darshan", true, 50));
		collection.add(new PalaceDTO("N S Palace", "Bangalore", "Shubham", true, 60));

		collection.stream().filter(dto -> !dto.isDestroyed()).collect(Collectors.toSet())
				.forEach(dto -> System.out.println(dto));
	}

}
