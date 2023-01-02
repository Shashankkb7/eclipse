package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collection.DTO.CompanyCEODTO;
import com.xworkz.collection.DTO.DaughterDTO;

public class CompanyRunner {

	public static void main(String[] args) {

		Collection<CompanyCEODTO> ceodtos = new LinkedList<CompanyCEODTO>();
		ceodtos.add(new CompanyCEODTO("Ratan Tata", "TCS", 80, "India", "MS", true));
		ceodtos.add(new CompanyCEODTO("Narayan murthy", "Infosys", 70, "India", "M.tech", true));
		ceodtos.add(new CompanyCEODTO("Julie sweeet", "Accenture", 29, "American", "MS", false));
		ceodtos.add(new CompanyCEODTO("Arvind krishna", "IBM", 28, "India", "MS", false));

		Collection<DaughterDTO> daughterDTOs = new LinkedList<DaughterDTO>();
		daughterDTOs.add(new DaughterDTO("Spoorthy", 9741235860L, 5, true, true));
		daughterDTOs.add(new DaughterDTO("Anusha", 9121235860L, 15, false, true));
		daughterDTOs.add(new DaughterDTO("Aishwarya", 9971235860L, 25, true, false));
		daughterDTOs.add(new DaughterDTO("Nayana", 9143235860L, 22, false, false));

		System.out.println("Printing details of ceo daughters dto");
		daughterDTOs.stream().collect(Collectors.toList()).forEach(dto -> System.out.println(dto));

		System.out.println(System.lineSeparator());
		System.out.println("Printing daughter names of company ceo's");
		daughterDTOs.stream().map(dto -> dto.getName()).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto));

		System.out.println(System.lineSeparator());
		System.out.println("Get company ceo's dtos where age is greater than 30");
		ceodtos.stream().filter(age -> age.getAge() >= 30).collect(Collectors.toList())
				.forEach(age -> System.out.println(age));
		
	}
}
