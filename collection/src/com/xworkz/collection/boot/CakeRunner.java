package com.xworkz.collection.boot;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.collection.DTO.CakeDTO;

public class CakeRunner {

	public static void main(String[] args) {

		CakeDTO cakeDTO1 = new CakeDTO("Honeycake", 150, "Red");
		CakeDTO cakeDTO2 = new CakeDTO("Honeycake", 150, "Red");

		Set<CakeDTO> set = new HashSet<CakeDTO>();
		set.add(cakeDTO1);
		set.add(cakeDTO2);

		for (CakeDTO cakeDTO : set) {
			System.out.println("Overriden :" + cakeDTO.hashCode());
			System.out.println("Original :" + System.identityHashCode(cakeDTO));
		}

	}

}
