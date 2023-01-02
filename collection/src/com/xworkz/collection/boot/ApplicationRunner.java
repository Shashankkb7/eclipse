package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;
import com.xworkz.collection.DTO.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {

		Collection<ApplicationDTO> applicationDTOs = new LinkedList<ApplicationDTO>();
		applicationDTOs.add(new ApplicationDTO("Google", 8.1, true, "Google", 50));
		applicationDTOs.add(new ApplicationDTO("Zomato", 8.2, false, "Unknown", 100));
		applicationDTOs.add(new ApplicationDTO("Gmail", 8.3, true, "Google", 150));
		applicationDTOs.add(new ApplicationDTO("Swiggy", 8.4, true, "Gottilla", 200));
		applicationDTOs.add(new ApplicationDTO("Youtube", 8.5, false, "Google", 50));

		System.out.println("printing application that is free and developed by google");
		applicationDTOs.stream().filter((dto) -> dto.isFree() && "Google".contains(dto.getDevelopedBy()))
				.collect(Collectors.toList()).forEach((dto) -> System.out.println(dto));

		System.out.println(System.lineSeparator());
		System.out.println("printing Version is greater");

		applicationDTOs.stream().filter(dto -> dto.getVersion() > 8.4).map(name -> name.getName())
				.collect(Collectors.toList()).forEach(dto -> System.out.println(dto));
	}

}
